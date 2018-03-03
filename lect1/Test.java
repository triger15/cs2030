/*
class A {
    public static int x = 1;
    public int y = 5;

    void incrX() {
        x = x + 1;
    }

    void incrY() {
        y = y + 1;
    }
}*/

class A {
    private int x;
  public void changeSelf() {
    x = 1;
  }
  public void changeAnother(A a) {
    a.x = 1;    
  }

}

class B {
    public void changeAnother(A a) {
        //a.x = 1;
        //violate private access mod
    }
}
/*
A a1 = new A();
A a2 = new A();*/
/* 
a2.x changes to 10
a2.y = 5
A.x = 3 valid
A.y invalid



*/