package FileIO_Folder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertFileIntoArrayBytes {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\abcd.txt";
        try {
            byte[] bytesArr = Files.readAllBytes(Paths.get(filePath));
            for(byte b : bytesArr){
                System.out.print("-"+b+ "-");
                System.out.print((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
