package FileIO_Folder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteWithBufferedWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\writewithbufferedwriter.txt"));
            bufferedWriter.write("This is first ine in the external file to wrtie in file");
            bufferedWriter.write("\nThis is second line");
            bufferedWriter.write("\nThis is Third line");
            bufferedWriter.write("This is Third line with the withoudt break the line");
            System.out.println("File content has een written suvcessfully");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
