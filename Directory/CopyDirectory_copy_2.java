package Directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyDirectory_copy_2 {
    public static void main(String[] args) {
//        try{
//            Path sourceDir = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\aaa");  // Source directory
//            Path destinationDir = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\createbyNio\\");  // Destination directory
//            Files.walk(sourceDir).forEach(sourcepath ->{
//                Path targetPath = destinationDir.resolve(sourceDir.relativize(sourcepath));
//                try {
//                    Files.copy(sourcepath , targetPath, StandardCopyOption.REPLACE_EXISTING);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
        Path s = Paths.get("C:\\");
        Path d = Paths.get("D:\\");
        try {
            Files.walk(s).forEach(spath -> {
                Path tPath = d.resolve(s.relativize(spath));
                try {
                    Files.copy(tPath, spath, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
