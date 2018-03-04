import java.util.*;

class S {
  public static void main(String[] args) {
    double d = (int) 5.5;
int i =  2.5;

System.out.println(d);
System.out.println(i);
  }
}

interface I {
    void f();
    default void g() {
      System.out.println("m"); 
    }
}
  
abstract class A implements I {
  abstract void h();
  abstract void h(int x);
  void j() {
  }
}

class B extends A {
  void h() {
  }
  
  void h(int y) {
  }
  public void f() {
  } 
}

/**
 * Q2: yes (subtype), no, y, y
 * Q3: no, need wrapper class. can. unchecked conversion.
 * Q5: no error
 * Q6a,b : no prob. 
 * c: cannot. Tnt >x Double.
 * d: can. Integer >> double (primitive!)
 * e: no prob
 * 7: cannot convert from double to int.
 * passing to reference requires actual value type. Widening allowed
 * int <: double
 */