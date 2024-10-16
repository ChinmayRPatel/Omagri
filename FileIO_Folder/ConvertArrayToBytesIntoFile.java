package FileIO_Folder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertArrayToBytesIntoFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\output.txt";
        byte[] fileBytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33}; // "Hello World!"
        try {
            Files.write(Paths.get(path), fileBytes);
            System.out.println("Bytes Arrays is written in file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
