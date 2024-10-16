package FileIO_Folder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileRenameAndCopy {
    public static void main(String[] args) throws IOException {
        try {

            File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\abcxyz.txt");
            File file2 = new File("abcxyzabcd.txt");
            if (file.renameTo(file2)) {
                System.out.println("Succesfully renames file");
            } else {
                System.out.println("File is not renamed ");
            }

//        Another method to rename file using the sibling
            Path p = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\example.txt");
            Files.move(p, p.resolveSibling("aaa.txt"));
            System.out.println("File is successfully renamed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //        ********reanming filename using nio library

        Path sourcePath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\aaa.txt");
        Path targetPath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\renamed_file.txt");

        try {
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File renamed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}