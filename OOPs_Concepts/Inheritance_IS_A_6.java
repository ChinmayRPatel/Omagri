package OOPs_Concepts;

class A{
    int sum(int a, int b){
        return a+b;
    }
}
class B extends A{
    int sub(int a, int b){
        return a-b;
    }
    int mul(int a, int b){
        return a*b;
    }
}
public class Inheritance_IS_A_6 {
    public static void main(String[] args) {
        A obj = new A();
        obj.sum(1, 2);
        B obj2 = new B();
        obj2.sum(11, 23);

    }
}
