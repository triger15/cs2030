public class WTF {
  class S {
  }

  class T extends S {
  }

  class U extends S {
  }

  void run() {
    S s1, s2;
    T t = new T();
    U u = new U();

    s1 = t; // always OK since this is a widening reference conversion.
    s2 = u; // always OK since this is a widening reference conversion.
    // t = s1; // not allowed since it is a narrowing reference conversion.
    t = (T) s1; // explicit conversion allowed by compiler, no problem during run time.
    t = (T) s2; // explicit conversion allowed by compiler, but cause run time error.
  }

  public static void main(String[] args) {
    WTF abc = new WTF();
    abc.run();
  }
}