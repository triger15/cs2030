class Walao {
  public static void main(String[] args) {

    A a = new A();
    C b = a.f();
    b.g();
    b.g();
  }
}

interface C {
  void g();
}

class A {
  int x = 1;

  C f() {
    int y = 1;

    class B implements C {
      public void g() {
        
        x = y; // accessing x and y is OK.
        //x++;
        System.out.println( "x = " + x + ", y = " + y);
      }
    }

    B b = new B();
    return b;
  }
}