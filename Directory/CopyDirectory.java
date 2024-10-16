package Directory;

import java.nio.file.*;
import java.io.IOException;

public class CopyDirectory {
    public static void main(String[] args) {
        Path sourceDir = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\aaa");  // Source directory
        Path destinationDir = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\createbyNio\\");  // Destination directory

        try {
            // Walk through the source directory and copy everything to the destination
            Files.walk(sourceDir).forEach(sourcePath -> {
                System.out.println(sourcePath);
                try {
                    Path targetPath = destinationDir.resolve(sourceDir.relativize(sourcePath));
                    Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            System.out.println("Directory copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//      ************* Another Method ong Method ****************
//
//package Directory;
//
//import java.nio.file.*;
//        import java.nio.file.attribute.BasicFileAttributes;
//import java.io.IOException;
//
//public class CopyDirectory {
//    public static void main(String[] args) {
//        Path sourceDir = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\aaa");  // Source directory
//        Path destinationDir = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\createbyNio\\");  // Destination directory
//
//        try {
//            // Walk through the source directory and copy everything to the destination
//            Files.walkFileTree(sourceDir, new SimpleFileVisitor<Path>() {
//                @Override
//                public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
//                    // Create the directory in the destination
//                    Path targetDir = destinationDir.resolve(sourceDir.relativize(file));
//                    Files.createDirectories(targetDir);
//                    return FileVisitResult.CONTINUE;
//                }
//
//                @Override
//                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                    // Copy each file to the destination
//                    Path targetFile = destinationDir.resolve(sourceDir.relativize(file));
//                    Files.copy(file, targetFile, StandardCopyOption.REPLACE_EXISTING);
//                    return FileVisitResult.CONTINUE;
//                }
//            });
//
//            System.out.println("Directory copied successfully.");
//
//        } catch (IOException e) {
//            // Handle exceptions
//            e.printStackTrace();
//        }
//    }
//}
