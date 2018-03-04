class Main {
    static void f() throws Exception {
      try {
        throw new ArrayIndexOutOfBoundsException();
      } catch (IllegalArgumentException e) {
        System.out.println("Caught in f");
      }
    }
  
    public static void main(String[] args) {
      try {
        System.out.println("Before f");
        f();
        System.out.println("After f");
      } catch (Exception e) {
        System.out.println("Caught in main");
      }
    }
  }


  /**
   * 5a: b4 f, b4 t,cgt f, aft f. unreachable after throw.
   * b: b, c, a
   * throws Exception has to be declared in f.
   * d: b, cgt, aft.
   * e: b4 f, caguth in main.
   * f: b4 f, caught a1b00b, aft f
   * g: exception alr caught still catch for fuck? compile error.
   * h: b4f,  caught a1b00b, aft f
   * i: b4 f, caught in main.
   * 
   */