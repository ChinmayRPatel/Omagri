package FileIO_Folder;

import java.io.File;
import java.io.FilenameFilter;

public class FindFileWithCertainExtensionOnly {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\";
        String extension = ".txt";
        File fileDir = new File(directoryPath);
        if(fileDir.isDirectory()){
            // Create a filename filter to filter files based on the extension
            FilenameFilter filter = (file, name) -> name.endsWith(extension);

            // List all files with the given extension
            File[] filesToDelete = fileDir.listFiles(filter);

            // Check if any files match the criteria
            if(filesToDelete!=null && filesToDelete.length >0){
                for(File file:filesToDelete){
                        System.out.println("File is found with extension :- "+extension + " is :- "+ file.getName());
                }
            }else{
                System.out.println("No file with extension "+extension +" found in mentioned Directory");
            }
        }else{
            System.out.println(fileDir.getAbsolutePath()+" is not a file directory");
        }

//*******************Another show method from above same code*****************

        System.out.println("Find the name of files with extension "+extension +" in directory = "+ directoryPath);
        File[] filesToFind = new File(directoryPath).listFiles((dir, name) -> name.endsWith(extension));
        for(File found: filesToFind){
            System.out.println(found.getName());
        }

    }
}

