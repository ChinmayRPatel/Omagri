package Directory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CheckDirectoryIsEmptyOrNot {
        public static void main(String[] args) {
            Path dirPath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\Directory");
            try{
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dirPath);
                // Check if the directory is empty by iterating over the directory stream
                if (!directoryStream.iterator().hasNext()) {
                    System.out.println("Directory is empty.");
                } else {
                    System.out.println("Directory is not empty.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
//            ********Another method**************

            try {
                Stream<Path> paths = Files.walk(dirPath);
                // Traverse and list all files and directories
                paths.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            ****Another method to check *******8
            try {
                // Check if the directory is empty by counting the number of entries
                boolean isEmpty = Files.list(dirPath).findAny().isEmpty();
                if (isEmpty) {
                    System.out.println("Directory is empty.");
                } else {
                    System.out.println("Directory is not empty.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
