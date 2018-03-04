class Test {

  
  public static void main(String[] args) {
    
    class A {
      public void f() {
        System.out.println("A f");
      }
    }
    
    class B extends A {
      private void f() {
        System.out.println("B f");
      }
    }
    
    B b = new B();
    A a = b;
    a.f();
    b.f();
  }
}


/**
 * 3: (a) ; runs and prints a f
 * (b) B f, B f, A f
 * (c) A f, Bf, Af, Bf
 * (d) Runtime error. stackoverflow as b.f runs repeated.
 * (e) Compile error. B f() cannot override A f() as same method signature, diff return type.
 * (f) Compile time error. method not overriden. a.f(0) throws error
 * (g) B f x2
 * (h) Af Bf. Hmm....
 * (i) Compile error as static method defined inside inner class. Also cannot override 
 * (j) Af Bf Af Bf
 * (k) compile error. x has private access.
 * (l, m) 0
 * (n) 1
 * (o) 0
 * 4: (b),(c),d
 */