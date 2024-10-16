package NestedClasses;
class OuterClass2{
    void outerMethod(){
        final int localVar=100;
        int a = 100;
    //    local inner side inside a method
        class LocalInerClass{
            void display(){
                System.out.println("Local Variab;e from Method :- "+localVar);
                System.out.println(a);
            }
        }
        LocalInerClass objlocalInerClass  = new LocalInerClass();
        objlocalInerClass.display();
    }
}
public class NonStaticLocalInerClass {
    public static void main(String[] args) {
        OuterClass2 obj2= new OuterClass2();
        obj2.outerMethod();
    }
}
