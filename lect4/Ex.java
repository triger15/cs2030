class Ex {
    public static void main(String[] args) {
        f();    
    
    }

    static void f() throws ArrayIndexOutOfBoundsException {
        try {
            System.out.println("trying");
            System.out.println('n');
            //throw new Exception();
            throw new NullPointerException("WT");
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println("wtf" + e);
        
        } finally {
            System.out.println("finally");
        
        }

    
    }

}
