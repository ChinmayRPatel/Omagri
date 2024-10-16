package FileIO_Folder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteWithBufferedOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\abcd.txt");
            String str = "T is fe content which will confverted into bytes array and it will go to file \n this is sencond line uin file \n this is 3rd";
            byte[] b = str.getBytes();
            fos.write(b);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
