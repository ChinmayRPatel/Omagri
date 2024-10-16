package OOPs_Concepts.AccessModifier;

public class PublicClass {  // Public access modifier
    public int publicVar = 10;  // Public variable
    protected int protectedVar = 20;  // Protected variable
    int defaultVar = 30;  // Default variable
    private int privateVar = 40;  // Private variable

    // Public method
    public void displayPublic() {
        System.out.println("Public method: Accessible from anywhere.");
    }

    // Protected method
    protected void displayProtected() {
        System.out.println("Protected method: Can be accessed within the same package or subclass.");
    }

    // Default (package-private) method
    void displayDefault() {
        System.out.println("Default method: Can be accessed within the same package.");
    }

    // Private method
    private void displayPrivate() {
        System.out.println("Private method: Can only be accessed within the same class.");
    }

    // Method to demonstrate access to private members within the same class
    public void accessPrivate() {
        System.out.println("Accessing private variable: " + privateVar);
        displayPrivate();
    }
}
