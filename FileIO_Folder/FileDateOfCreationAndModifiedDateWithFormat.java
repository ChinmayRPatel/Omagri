package FileIO_Folder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

public class FileDateOfCreationAndModifiedDateWithFormat {
    public static void main(String[] args) {
        try{

        // storing the path of the file in the variable
        String filename = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\FileDateOfCreationAndModifiedDateWithFormat.java";

        // creating the File class object
        File my_file = new File(filename);

        // creating the path object
        Path path = my_file.toPath();

        // creating BasicFileAttributes class object using
        // readAttributes method
        BasicFileAttributes file_att = Files.readAttributes(path, BasicFileAttributes.class);

        // creating simple date format object to make the
        // output more readable
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.print("File Creation Time: ");

        // converting time to milliseconds then specifying
        // the format in which we want the output
        System.out.println(sd.format(file_att.creationTime().toMillis()));

        System.out.println("Indian TIme :- " +sd.format(file_att.creationTime().toMillis()));

        System.out.println("Last Modified Date :- "+ sd.format(file_att.lastModifiedTime().toMillis()));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
