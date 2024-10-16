package FileIO_Folder;

import java.io.File;

public class ReadOnlyFileMake {
    public static void main(String[] args) {
        File file  = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\mr.txt");
//        file.setExecutable(false, true);
//        file.setReadable(true, true);
//        file.setWritable(false, true);

        file.setReadOnly();

//        file.setReadOnly();
        System.out.println("This file is Readable :- "+ file.canRead());
        System.out.println("This file is Write :- "+ file.canWrite());
        System.out.println("This file is Executable  :- "+ file.canExecute());
    }
}
