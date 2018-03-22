import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class LambdaList<T> {
  List<T> list;

  public static void main(String[] args) {
    LambdaList<Integer> oneThree = LambdaList.of(1,2,3);
    System.out.println(oneThree);
    int start = 0;
    Supplier<Integer> supp = () -> {return start + 5;};
    LambdaList<Integer> create = LambdaList.generate(10, supp);
    System.out.println(create);
  }

  public static <T> LambdaList<T> of(T... varargs) {
    List<T> list = new ArrayList<>();
    for (T e : varargs) {
      list.add(e);
    }
    return new LambdaList<T>(list);
  }  

  private LambdaList(List<T> list) {
    this.list = list;
  }

  // generate lambda list from supplier
  public static <T> LambdaList<T> generate(int count, Supplier<T> s) {
    List<T> newList = new ArrayList<>();
    for (int i = 0; i < count; i++) {
        T item = s.get();
        newList.add(item);
    }
    return new LambdaList<T>(newList);
  }

  public <V> LambdaList<V> map(Function<? super T, ? extends V> f) {
    List<V> newList = new ArrayList<V>();
    for (T i: list) {
      newList.add(f.apply(i));
    }
    return new LambdaList<V>(newList);
  }

  // accumulate through the list
  public <U> U reduce(U identity, BiFunction<? super U, ? super T, ? extends U> accumulator) {
    U sum = identity;
    // compute result after iterating through list with accumulator
    for (T var : this.list) {
        sum = accumulator.apply(sum, var);
    }
    return sum;
  }

  // filter list elements that are true
  public LambdaList<T> filter(Predicate<? super T> predicate) {
    List<T> newList = new ArrayList<T>();
    for (T ele : this.list) {
        // if predicate returns true for element, add it to list
        if (predicate.test(ele)) {
            newList.add(ele);
        }
    }
    return new LambdaList<T>(newList);
  }

  // consumes each list element
  public void forEach(Consumer<? super T> action) {
    for (T item : this.list) {
      action.accept(item);
    }
  }

  public String toString() {
    return list.toString();
  }
}