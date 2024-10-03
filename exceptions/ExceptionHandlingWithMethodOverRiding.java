package exceptions;

class Parent {
    void show() throws Exception {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() throws ArithmeticException {  // Unchecked exception
        System.out.println("Child class");
//        int c=12/0;
//        System.out.println(c);
    }
}

public class ExceptionHandlingWithMethodOverRiding {
    public static void main(String[] args) throws Exception {
        Parent obj = new Child();
        obj.show();  // Will call Child's overridden method
    }
}
