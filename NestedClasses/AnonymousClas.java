package NestedClasses;
interface Greeting{
    void sayHello();
}
public class AnonymousClas {
    public static void main(String[] args) {
        Greeting obj = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("This is say hello in anonymous class");
            }
        };
//        Greeting obj1 = obj;
        obj.sayHello();
    }
}
