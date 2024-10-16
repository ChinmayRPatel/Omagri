package OOPs_Concepts;

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}

public class CallByReference_22 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(100);
        System.out.println("Before calling changeValue: " + obj.value); // Output: 10

        changeValue(obj); // Passing by reference

        System.out.println("After calling changeValue: " + obj.value); // Output: 20
    }

    public static void changeValue(MyClass myClass) {
        myClass.value = myClass.value + 20; // Changing the object's value
        System.out.println("Inside changeValue: " + myClass.value); // Output: 20
    }
}