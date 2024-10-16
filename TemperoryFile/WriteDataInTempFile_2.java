package TemperoryFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteDataInTempFile_2 {
    public static void main(String[] args) {
        try{
            Path tempFile = Files.createTempFile("temp",".txt");
            List<String> lines = List.of("Line 1", "Line 2", "Line 3");
            Files.write(tempFile, lines, StandardCharsets.UTF_8);
            System.out.println("Written successfully in temp file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
