package OOPs_Concepts;

public class CommandLineArgs {
    public static void main(String[] args) {
        // Check if any arguments are provided
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
            return;
        }

        // Print the command line arguments
        System.out.println("Command Line Arguments:");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
