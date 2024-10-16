package OOPs_Concepts;

class Car{
    public Car(){
        System.out.println("Thihs is Your Default Car");
    }

    public Car(String name){
        System.out.println("The name of the car is :- "+ name);
    }


    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void sum(double a, int b, int c){
        System.out.println(a+b+c);
    }

    public void sum(int a,double b, int c){
        System.out.println(a+b+c);
    }

    public void sum(int a,int  b, double c){
        System.out.println(a+b+c);
    }

}
class Suzuki extends Car{
    @Override
    public void sum(int a, int b){
        System.out.println("The Suzuki Sum is "+ a+b);
    }

}
public class ObjectAndClass_2{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Hyundai");
        c1.sum(12, 23);
        c1.sum(12, 23, 30);

        c2.sum(50, 50);
        c2.sum(50, 50, 50);

        Car c3 = new Car();
        c3.sum(12, 23);
        c3.sum(12, 235.34, 30);

        Suzuki s = new Suzuki();
        s.sum(112, 23);
    }
}