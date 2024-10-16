package Directory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoy_1 {
    public static void main(String[] args) {
        try{

            Path dirPath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\createdbyNio");
            if(!Files.exists(dirPath)){
                    System.out.println("Diroctory is not exist");
//    If there is single folder you want to create then use ony directory only and for multuple directories
                    Files.createDirectory(dirPath);
                    System.out.println("Diroctory is Created successfully");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }
}
