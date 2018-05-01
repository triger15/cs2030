import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Optional<T> {
  private T value;

  /**
   * Constructor for Optional
   */
  private Optional(T v) {
    this.value = v;
    System.out.println("created manually");
  }

  public static <T> Optional<T> of(T v) {
    if (v == null) {
      throw new NullPointerException("value cannot be null");
    } else {
      Optional<T> obj = new Optional<T>(v);
      return obj;
    }
  }

  public static <T> Optional<T> ofNullable(T v) {
    Optional<T> obj = new Optional<T>(v);
    return obj;
  }

  public static <T> Optional<T> empty() {
    return new Optional<T>(null);
  }

  public T get() {
    return this.value;
  }

  public void ifPresent(Consumer<? super T> consumer) {
    if (value != null) {
      consumer.accept(value);
    }
  }

  public Optional<T> filter(Predicate<? super T> predicate) {
    T obj = null;
    if (value != null && predicate.test(value)) { // if value present and pass pred
      obj = value;
    }
    return Optional.ofNullable(obj);
  }

  public <U> Optional<U> map(Function<? super T, ? extends U> mapper) {
    U obj = null;
    if (value != null) {
      obj = mapper.apply(value);
    }
    return Optional.ofNullable(obj);
  }

  public <U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper) {
    Optional<U> obj = Optional.empty();
    if (value != null) {
      obj = mapper.apply(value);
    }
    return obj;
  }

  public T orElseGet(Supplier<? extends T> other) {
    return value != null ? value : other.get();
  }

}