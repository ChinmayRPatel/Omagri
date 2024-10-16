package OOPs_Concepts;

final class Car3{
    final String name = "abcd"; // can't change
    public void cardisplay(){
        System.out.println("Name of the car is - "+ name);
//        name = "c";//throw an error
    }
}
//class Demo extends  Car3{
   //cant inherit  the final class
//}

public class Final_12 {
    public static void main(String[] args) {
        Car3 c = new Car3();
        c.cardisplay();
    }
}
