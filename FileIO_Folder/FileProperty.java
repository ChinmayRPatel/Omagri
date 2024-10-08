package FileIO_Folder;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FileProperty {

    public static void main(String[] args) {

//        Here is the folder path which have different types of file handling methods which are used in below code
        String fname = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder";
        File f = new File(fname);
        System.out.println("File Name Is : - "+f.getName());
        System.out.println("Path of File is :- "+f.getPath());
        System.out.println("Parent is :- "+ f.getParent());
        System.out.println("Exists :- "+f.exists());
        if (f.exists()) {
            // get the contents into arr[]
            // now arr[i] represent either a File or
            // Directory
            String arr[] = f.list();

            // find no. of entries in the directory
            int n = arr.length;

            // displaying the entries
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
                // create File object with the entry and
                // test if it is a file or directory
                File f1 = new File(arr[i]);
                if (f1.isFile())
                    System.out.println(": is a file");
                if (f1.isDirectory())
                    System.out.println(": is a directory");
            }
            System.out.println(
                    "No of entries in this directory " + n);
        }else{
            System.out.println("No Data Found");
        }
    }
}
