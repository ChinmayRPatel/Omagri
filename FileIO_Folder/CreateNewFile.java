package FileIO_Folder;// Java Program to create new file using File class

// Importing new files
import java.io.File;
import java.io.BufferedReader;

// Importing as it converts bits to strings
import java.io.InputStreamReader;

public class CreateNewFile {

    public static void main(String args[])
    {
        try {
            File file1 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\" + "" + "Xys" + ".txt");
            boolean flag = file1.createNewFile();
            System.out.println(flag);
        }

        // Try-Catch Block
        catch (Exception ex1) {
            System.out.println(ex1.getMessage());
        }
    }
}
