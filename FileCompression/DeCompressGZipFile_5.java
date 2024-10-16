package FileCompression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class DeCompressGZipFile_5 {

    // Method to decompress a GZIP file
    public static void decompressGzipFile(String gzipFilePath, String destFilePath) {
        try {
            FileInputStream fis = new FileInputStream(gzipFilePath);
            GZIPInputStream gzipIn = new GZIPInputStream(fis);
            FileOutputStream fileOut = new FileOutputStream(destFilePath);

            byte[] buffer = new byte[fis.available()];
            int bytesRead;
            // Read data from the GZIP input stream and write it to the output file
            while ((bytesRead = gzipIn.read(buffer)) != -1) {
                fileOut.write(buffer, 0, bytesRead);
            }

            System.out.println("File decompressed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        String gzipFilePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\Gzip_Project.gz"; // Replace with the GZIP file you want to decompress
        String destFilePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\DecompressedGZipFile.txt";    // Replace with the output file path

        decompressGzipFile(gzipFilePath, destFilePath);
    }
}
