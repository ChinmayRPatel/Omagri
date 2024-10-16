package NestedClasses;
//Inner class member is also called non static inner class
class Outer{
    private String outerField = "Hello from outer class";
    class InnerClass{
        void display(){
            String str = outerField;
            System.out.println(str+" --- From Inner class");
        }
    }
}

public class NonStaticMemberInnerClass {
    public static void main(String[] args) {
        Outer oObj = new Outer();
        Outer.InnerClass iObj = oObj.new InnerClass();
        iObj.display();
    }
}
