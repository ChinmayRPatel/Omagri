package FileIO_Folder;


import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = null;
            fos = null;
            fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\mr.txt");
            fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\qq.txt");
            int c;

            // Condition check
            // Reading the input file till there is input
            // present
            while ((c = fis.read()) != -1) {

                // Writing to output file of the specified
                // directory
                fos.write(c);
            }
            System.out.println("File is copied successfully");
            // Optional finally keyword but is good practice to
            // empty the occupied space is recommended whenever
            // closing files,connections,streams
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            // Closing the streams

            if (fis != null) {

                // Closing the fileInputStream
                fis.close();
            }
            if (fos != null) {

                // Closing the fileOutputStream
                fos.close();
            }


//***************            Another method using the channel to copy the file   * ***************************
            // Creating two channels one input and other output
            // by creating two objects of FileChannel Class
            FileChannel src
                    = new FileInputStream(
                    "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\aaa.txt")
                    .getChannel();
            FileChannel dest
                    = new FileOutputStream(
                    "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\output.txt")
                    .getChannel();

            // Try block to check for exceptions
            try {

                // Transferring files in one go from source to
                // destination using transferFrom() method
                dest.transferFrom(src, 0, src.size());
                // we can also use transferTo
                // src.transferTo(0,src.size(),dest);
            }

            // finally keyword is good practice to save space in
            // memory by closing files, connections, streams
            finally {

                // Closing the channels this makes the space
                // free

                // Closing the source channel
                src.close();

                // Closing the destination channel
                dest.close();
            }
        }

//        *****************3rd and easy way to copy the file using the file class********
        File src = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\aaa.txt");
        File dest = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\abcdefg.txt");
        Files.copy(src.toPath(), dest.toPath());


        // *********** copying the file using nio library
        Path sourcePath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\qq.txt");
        Path destPath = Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\copied_file_name.txt");

        try {
            Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

