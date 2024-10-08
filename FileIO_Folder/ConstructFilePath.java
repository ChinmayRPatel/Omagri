package FileIO_Folder;

import java.io.File;
import java.io.IOException;

public class ConstructFilePath {
    public static void main(String[] args) {
        // Absolute path (specify the full path on your system)
//        String absolutePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\xyz.txt";
//        File file = new File(absolutePath);

        // Relative path (file will be created relative to the working directory)
        String relativePath = "example.txt";

        File file = new File(relativePath);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
