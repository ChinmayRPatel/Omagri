package FileIO_Folder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AssignFileContentToVariable {
    public static void main(String[] args) {
            String filePath =  "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\UTF_8\\UTF_8.txt";
        try {
            String content = Files.readAllLines(Paths.get(filePath)).toString();
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
