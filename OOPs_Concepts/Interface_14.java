package OOPs_Concepts;

interface  Inter1{
    void add();
    void sub();
}
class Child4 implements Inter1{

    @Override
    public void add() {
        System.out.println("Add is called");
    }

    @Override
    public void sub() {
        System.out.println("Sub is called");
    }
}
public class Interface_14 {
    public static void main(String[] args) {
        Child4 obj = new Child4();
        obj.add();
        obj.sub();
    }
}
