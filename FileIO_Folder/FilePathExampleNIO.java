package FileIO_Folder;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathExampleNIO {
    public static void main(String[] args) {

        // Using Paths.get to create a file path
        Path path = Paths.get("D:/dir/subdir/createdByNois/example.txt");
        try {

            Files.createDirectories(path.getParent()); // Create directories if they don't exist
            Files.createFile(path);
            System.out.println("File created at: " + path.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}