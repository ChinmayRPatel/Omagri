package FileIO_Folder;

import java.io.File;

public class FileExistOrHidden {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\abc - copy (2).txt");
//        File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\abc - copy.txt");

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists.");

            // Check if the file is hidden
            if (file.isHidden()) {
                System.out.println("File is hidden.");
            } else {
                System.out.println("File is not hidden.");
            }
        } else {
            System.out.println("File does not exist.");
        }


    }
}
