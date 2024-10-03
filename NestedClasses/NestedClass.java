package NestedClasses;

class OuterClass{
    static int outerStaticVar=10;
    int outerInstanceVar=20;
//    Static nested class can only access the only static variable
    static class StaticNestedClass{
        void display(){
//            Can only access the static members of outer class
            System.out.println("Static variable from outer class "+ outerStaticVar);
//            System.out.println(outerInstanceVar);//not accessible
        }
    }
    public void display(){
        System.out.println(outerStaticVar);
        System.out.println(outerInstanceVar);
    }
}
public class NestedClass {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
        obj.display();
        OuterClass obj2 = new OuterClass();
        obj2.display();
    }
}
