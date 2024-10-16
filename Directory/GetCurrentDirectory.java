package Directory;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class GetCurrentDirectory {
    public static void main(String[] args) {
        Path currentWorkingDir = Paths.get(System.getProperty("user.dir"));
        System.out.println("Current Working Directory absolute path :- "+currentWorkingDir.toAbsolutePath());

//        ***** ANOTHER METHDOD TO PRINT THE CURRENT WORKING DIRECTORY ********
        Path currentWorkingDir2 = FileSystems.getDefault().getPath("").toAbsolutePath();
        System.out.println(currentWorkingDir2);

    }
}
