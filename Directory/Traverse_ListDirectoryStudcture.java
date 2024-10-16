package Directory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Traverse_ListDirectoryStudcture {
    public static void main(String[] args) {
            Path dirPath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\createbyNio");

            try {
                Stream<Path> paths = Files.walk(dirPath);
                // Traverse and list all files and directories
                paths.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }

//            ******************* Another Method to traversal ************

        try{

            Files.walkFileTree(dirPath, new SimpleFileVisitor<Path>(){
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
                   System.out.println("File ="+ file);
                   return FileVisitResult.CONTINUE;
               }
               public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attributes ){
                   System.out.println("Directory "+ dir);
                   return FileVisitResult.CONTINUE;
               }

            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }



    }
}
