package FileIO_Folder;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Write_UTF_8_EncodedDataInFile {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\utf8file.txt");

        // Data to write
        List<String> linesToWrite = List.of(
                "Hello, World!",
                "This is a test.",
                "UTF-8 encoding example."
        );

        // Write to the file
        try {
            Files.write(filePath, linesToWrite, StandardCharsets.UTF_8);
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Read from the file
        try {
            List<String> linesRead = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            System.out.println("Data read from the file:");
            for (String line : linesRead) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }

    }
}
