package FileIO_Folder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream {
    public static void main(String[] args) throws IOException {
        String data = "This is the test line of the data for utput stream";
        OutputStream outputStream=new java.io.FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\abcd.txt");
        byte[] arr = data.getBytes();
        try {
            outputStream.write(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            outputStream.close();
        }

    }
}
