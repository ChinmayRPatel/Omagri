package Directory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteDirectoryUsingNio {
    public static void main(String[] args) {
        try{

            // Define the path of the directory to be deleted
            Path dirPath = Paths.get("C:/exampleDirectory");

            // Delete the directory (must be empty)
            Files.delete(dirPath);

            // Print confirmation
            System.out.println("Directory deleted: " + dirPath.toAbsolutePath());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
