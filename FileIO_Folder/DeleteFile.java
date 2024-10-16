package FileIO_Folder;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\xyz.txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("File is deleted successfully");
            }else{
                System.out.println("File is not deleted");
            }
        }else{
            System.out.println("File is not exists");
        }
    }
}
