package FileIO_Folder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileSizeAndFilePath
{
    public static void main(String[] args) throws IOException {
        Path pathname = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\ReadOnlyFileMake.java");
        BasicFileAttributes file_att = Files.readAttributes(pathname, BasicFileAttributes.class);


        LocalDateTime creationDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(file_att.creationTime().toMillis()), ZoneId.systemDefault());
        System.out.println(" File Creation Date : -" + creationDateTime);

        LocalDateTime modifiedDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(file_att.lastModifiedTime().toMillis()), ZoneId.systemDefault());
        System.out.println(" File Last Modification Date : -" + modifiedDateTime);

//********** File size and path &**********************************
        File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\ReadOnlyFileMake.java");
        // 16. Get File Size and File Path
        long fileSize = file.length(); // Get the file size in bytes
        System.out.println("File Size (in bytes): " + fileSize);

        String filePath = file.getPath(); // Relative file path
        System.out.println("File Path: " + filePath);

        String absolutePath = file.getAbsolutePath(); // Absolute file path
        System.out.println("Absolute Path: " + absolutePath);


        String canonicalPath = file.getCanonicalPath(); // Canonical path
        System.out.println("Canonical Path: " + canonicalPath);



    }
}
