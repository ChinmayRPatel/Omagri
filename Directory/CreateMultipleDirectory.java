package Directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateMultipleDirectory {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\createdbyni\\nios\\new\\i\\o\\lib");
//            This line will create the new direcories if it not exist
            Files.createDirectories(p);
            System.out.println("Hare is dorectory created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
