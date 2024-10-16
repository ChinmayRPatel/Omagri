package OOPs_Concepts;

class A_17{
    void show(){
        System.out.println("Parent class method");
    }
}
class B_17 extends  A_17{
    void wow(){
        System.out.println("Child class of A and wow method");
    }
//    void show(){
//        System.out.println("This is child class show");
//    }
}
public class UpCastDownCastWithInstanceOf_17 {
    public static void main(String[] args) {
        A_17 obj1 = new B_17(); // Upcasting
        obj1.show();    //by default call the parent class but if chikd class have same method then it show the overridden method output ese parent class method
//        obj1.wow();   // This will throw an error because of the Updasting only access the method of parent class or child class overriden method buy child class

        B_17 b3 = new B_17();
        A_17 a3 = new A_17();

        System.out.println("********");
        System.out.println(obj1 instanceof B_17);
        System.out.println(b3 instanceof B_17);
        System.out.println(a3 instanceof B_17);
        System.out.println("********");
        if (obj1 instanceof B_17) {
            B_17 obj2 = (B_17) obj1;  // Downcasting
            obj2.wow();  // Now we can call the child-specific method wow()
            b3.wow();
        } else {
            System.out.println("The object is not an instance of B_17");
        }




    }
}
