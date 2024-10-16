package TemperoryFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteTempFile_3 {
    public static void main(String[] args) {
        try {
            Path tfilepath = Paths.get("C:\\Users\\Admin\\AppData\\Local\\Temp\\temp11891312853925009902.txt");
            if(Files.exists(tfilepath)){
                System.out.println("File path is exist");
                Files.delete(tfilepath);
                System.out.println("File is deleted successfully");
            }else{
                System.out.println("File path is not exists");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}