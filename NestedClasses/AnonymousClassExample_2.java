package NestedClasses;

interface Age{
    int age = 20;
    void show();
}
public class AnonymousClassExample_2 {
    public static void main(String[] args) {
        Age a1 = new Age() {
            @Override
            public void show() {
                System.out.println("This is anonymous class = and age = "+age);
            }
        };
        a1.show();

    }
}
