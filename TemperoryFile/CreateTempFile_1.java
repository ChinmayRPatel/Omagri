package TemperoryFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateTempFile_1 {
    public static void main(String[] args) {
        try{
            Path filepath = Files.createTempFile("tempFIle",".tmp");
            System.out.println(filepath.getParent().toAbsolutePath());


//            Path tempDir = Paths.get("/your/custom/temp/directory");
//            Path tempFile = Files.createTempFile(tempDir, "tempFileExample", ".txt");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
