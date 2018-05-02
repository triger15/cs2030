import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Streams {
  public static void main(String[] args) {
    Streams strm = new Streams();
    LongStream pFactorsOfSix = strm.primeFactors(6);
    LongStream counting = strm.omega(10);
    long[] stuff = pFactorsOfSix.toArray();
    System.out.println(Arrays.toString(stuff));
    System.out.println(Arrays.toString(counting.toArray()));
  }

  public LongStream factors(long x) { // Q2a
    return LongStream.rangeClosed(1, x)
                      .filter(num -> x % num == 0);
  }

  LongStream primeFactors(long x) { // Q2b
    return factors(x).filter(y -> isPrime((int)y) && y != 1);
  }

  LongStream omega(int n) { // Q2c
    return LongStream.rangeClosed(1, n)
                      .map(y -> primeFactors(y).count());
  }

  boolean isPrime(int x) {
    return IntStream.range(2, x)
        .noneMatch(i -> x % i == 0); // true if none of the stream matches pred
  }

  public static <T, U, R> Stream<R> product(List<T> list1, List<U> list2, // Q3
      BiFunction<? super T, ? super U, R> f) {
        return list1.stream().flatMap(x -> 
          list2.stream().map(y -> f.apply(x, y))
        );
  }

  Stream<BigInteger> fib(int n) { // Q4
    return Stream.iterate(new Pair<>(BigInteger.ZERO, BigInteger.ONE),
        pr -> new Pair<>(pr.second, pr.first.add(pr.second)))
        .map(pr -> pr.second).limit(n); // return pair's second and limit
  }


}

class Pair<T, U> {
  T first;
  U second;
  public Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }
}