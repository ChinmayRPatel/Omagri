package exceptions;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            ExceptionPropagation obj = new ExceptionPropagation();
            obj.method1();
        } catch (Exception e) {
            System.out.println("Exception caught in method");
        }
    }
    public void method1(){
        method2();
    }
    public void method2(){
        int a =12;
        int b=0;
        System.out.println(a/b);
    }
}
