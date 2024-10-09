package FileIO_Folder;

import java.awt.geom.Path2D;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFilesWithExtensionFileNIO {
    public static void main(String[] args) throws IOException {
        Path directoryPath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\");
        String extension = ".txt";
        if(Files.isDirectory(directoryPath)){
            System.out.println("Directory is found");
            try{

            Files.walkFileTree(directoryPath, new SimpleFileVisitor<Path>(){
                public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {
                    System.out.println("file is "+ file.toString());
                    if(file.toString().endsWith(extension)){
                        Files.delete(file);
                        System.out.println("File is deleted successflly :- "+ file.getFileName());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }else{
            System.out.println("ther is no such directory find as :- "+ directoryPath);
        }

    }
}
