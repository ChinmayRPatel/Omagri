package OOPs_Concepts;// Java program to demonstrate working of instanceof Keyword

// Class 1
// Parent class

class Parent1 {

}

// Class 2
// Child class
class Child1 extends Parent1 {

}

class Instance_Of {

    public static void main(String[] args)
    {

        // Creating object of child class
        Child1 cobj = new Child1();

        // A simple case
        if (cobj instanceof Child1)
            System.out.println("cobj is instance of Child");
        else
            System.out.println(
                    "cobj is NOT instance of Child");

        // instanceof returning true for Parent class also
        if (cobj instanceof Parent1)
            System.out.println(
                    "cobj is instance of Parent");
        else
            System.out.println(
                    "cobj is NOT instance of Parent");

        // instanceof returns true for all ancestors

        // Note : Object is ancestor of all classes in Java
        if (cobj instanceof Object)
            System.out.println(
                    "cobj is instance of Object");
        else
            System.out.println(
                    "cobj is NOT instance of Object");
    }
}
