package FileIO_Folder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetTotalNumberOfLinesInFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\GetTotalNumberOfLinesInFile.java" ;
        try {
            int line = (int) Files.lines(Paths.get(filePath)).count();
            System.out.println("The lines of files is :- "+line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
