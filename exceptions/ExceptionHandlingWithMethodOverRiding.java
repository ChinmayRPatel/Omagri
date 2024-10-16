package exceptions;

import java.sql.SQLOutput;

class Parent {
    void show() throws Exception {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() throws ArithmeticException {  // Unchecked exception
        System.out.println("Child class");
        int c=12/0;
        System.out.println(c);
    }
}

public class ExceptionHandlingWithMethodOverRiding {
    public static void main(String[] args)  {
        try{
            Parent obj = new Child();
            obj.show();  // Will call Child's overridden method

        }catch (Exception e){
            System.out.println("Error Occured And Reason = "+e.getMessage());
            System.out.println(e.toString());
            System.out.println(e.getLocalizedMessage());
        }
    }
}
