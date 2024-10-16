package NestedClasses;

class Demo{
    void show(){
        System.out.println("This is demo show");
    }
}

public class AnonymousClassExample_3 {
    static Demo d1 = new Demo(){
        void show(){
            System.out.println("This is flavour class demo object ");
            super.show();
            System.out.println("This is flavour class demo object ");
        }
    };
    public static void main(String[] args) {
        d1.show();

    }
}
