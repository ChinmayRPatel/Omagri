package FileIO_Folder;

// Java Program to Check the Current File Permissions

// Importing required classes
import java.io.*;

// Main class
public class FilePermissionCheck {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating a file by
        // creating object of File class
        File file= new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\xyz.txt");

        // Checking if the file exists
        // using exists() method of File class
        boolean exists = file.exists();
        if (exists == true) {

            // Printing the permissions associated
            // with the file
            System.out.println("Executable: "
                    + file.canExecute());
            System.out.println("Readable: "
                    + file.canRead());
            System.out.println("Writable: "
                    + file.canWrite());
//            set that it not allow any thing
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(false);

            // Printing the permissions associated
            // with the file
            System.out.println("**** After the setting up the permissions of file ****");
            System.out.println("Executable : "
                    + file.canExecute());
            System.out.println("Readable: "
                    + file.canRead());
            System.out.println("Writable: "
                    + file.canWrite());


        }

        // If we enter else it means
        // file does not exists
        else {
            System.out.println("File not found.");
        }
    }
}