package FileIO_Folder;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendContentToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\writewithbufferedwriter.txt";
        String data = "\nThis is the appended content.\n and the is second line after the \\n in line and \\n is escape sequence in java";
        String data2 = "\nThis is the appended content.\n and the is second line after the \\n in line and \\n is escape sequence in java";
        String data3 = "\nThis is the appended content.\n and the is second line after the \\n in line and \\n is escape sequence in java";

        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            // Convert the string into bytes and append it to the file
            byte[] dataBytes = data.getBytes();
            fos.write(dataBytes);
            fos.write(data2.getBytes());
            fos.write(data3.getBytes());
            System.out.println("Content has been appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
