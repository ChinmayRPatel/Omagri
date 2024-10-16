package TemperoryFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempFilePath {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("tempFileExample", ".txt");
            Path tempFilePath = tempFile.toAbsolutePath();
            System.out.println("Temporary file created at: " + tempFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
