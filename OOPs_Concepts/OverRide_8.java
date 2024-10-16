package OOPs_Concepts;

class Parent{
    public  void car(){
        System.out.println("This is father car");
    }
    public  void home(){
        System.out.println("This is Father Home");
    }
}
class Child extends  Parent{
    @Override
    public void car(){
        System.out.println("This is child's new CAR");
    }
}
public class OverRide_8 {
    public static void main(String[] args) {
        Child c = new Child();
        c.car();
        Parent p = new Parent();
        p.car();
        Parent c1 = new Child();
        c1.car();
    }
}
