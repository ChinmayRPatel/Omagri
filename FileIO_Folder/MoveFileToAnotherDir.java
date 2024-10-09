package FileIO_Folder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFileToAnotherDir {
    public static void main(String[] args) throws IOException {
        String sourceUrl = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\qq.txt";
        String dest = "C:\\Users\\Admin\\OneDrive\\Desktop\\abc.txt";

        Path temp = Files.move(Paths.get(sourceUrl), Paths.get(dest));
        if(temp!= null){
            System.out.println("The file is moved successfully");
        }else{
            System.out.println("The file not is moved successfully");
        }

//        ****************  Moving the file using the file class method using the rename
        // Specify the source file
        File sourceFile = new File(sourceUrl);

        // Specify the destination directory and target file
        File targetFile = new File(dest);

        // Move the file
        if (sourceFile.renameTo(targetFile)) {
            System.out.println("File moved successfully.");
        } else {
            System.out.println("Failed to move the file.");
        }
    }
}
