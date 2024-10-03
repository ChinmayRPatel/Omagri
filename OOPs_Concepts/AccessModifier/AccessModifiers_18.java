// File: AccessModifiersExample.java
package OOPs_Concepts.AccessModifier;

class DefaultClass {  // Default access modifier (package-private)
    void displayDefault() {  // Default method
        System.out.println("Default method: Can be accessed within the same package.");
    }
}

class SubClass extends PublicClass {  // Subclass to demonstrate protected access
    public void accessProtected() {
        // Accessing protected member of the parent class
        System.out.println("Accessing protected variable from subclass: " + protectedVar);
        displayProtected();  // Accessing protected method
    }
}

