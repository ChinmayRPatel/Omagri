package OOPs_Concepts;

abstract  class Vehicel1{
    public  Vehicel1(){
        System.out.println("Vehicle abstract class COnstructor");
    }
    abstract  void speed();
    public void fuel(){
        System.out.println("Fuel of vehicle is PETROL");
    }
}
class Bike2 extends Vehicel1{
    public Bike2(){
        System.out.println("Bike 2 child of abstract class");
    }
    void speed(){
        System.out.println("Speed is about 70");
    }
}
public class Abstract_13 {
    public static void main(String[] args) {
        Bike2 b = new Bike2();
        b.speed();
        b.fuel();
//        Vehicel1 v = new Vehicel1();
    }
}
