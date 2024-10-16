package OOPs_Concepts.AccessModifier;

public class AccessModifiersExample_18 {
    public static void main(String[] args) {
        // Create an instance of PublicClass
        PublicClass obj = new PublicClass();

        // Accessing public members
        System.out.println("Public variable: " + obj.publicVar);
        obj.displayPublic();

        // Accessing protected members
        // Can be accessed within the same package
        System.out.println("Protected variable: " + obj.protectedVar);
        obj.displayProtected();

        // Accessing default (package-private) members
        System.out.println("Default variable: " + obj.defaultVar);
        obj.displayDefault();

        // Accessing private members (only through a public method within the same class)
        obj.accessPrivate();

        // Demonstrating subclass access to protected members
        SubClass subObj = new SubClass();
        subObj.accessProtected();  // Accessing protected members from subclass

        // Accessing default class and its members within the same package
        DefaultClass defaultObj = new DefaultClass();
        defaultObj.displayDefault();  // Default access
    }
}
