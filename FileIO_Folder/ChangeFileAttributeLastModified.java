package FileIO_Folder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class ChangeFileAttributeLastModified {
    public static void main(String[] args) {
        try{

            String filepath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\output.txt";
            System.out.println("Old file time is "+ Files.getLastModifiedTime(Paths.get(filepath)));

            Path fileTime = Files.setLastModifiedTime(Paths.get(filepath), FileTime.from(Instant.now()));
            System.out.println("Time is changed successfully "+  FileTime.from(Instant.now()));

            FileTime updated = Files.getLastModifiedTime(Paths.get(filepath));
            System.out.println("Udated time is "+updated);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
