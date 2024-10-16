package FileIO_Folder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class WriteToFileIntoUTF_8Encoding {
            public static void writeToFileWithCharset(String fileName, String content, Charset charset)
            {
                try
                {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    // writing content to the file
                    String encodedText = Base64.getEncoder().encodeToString(content.getBytes("UTF-8"));
                    fileOutputStream.write(encodedText.getBytes());
                    System.out.println("File created with charset: " + encodedText);
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            // Main Function
            public static void main(String args[])
            {
                try{
                    String fileName = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\output.txt";
                    String content = "Hello, this is a file with a specific charset.\nThis is an utf-8 encoded \n this is 3rd line ";

                    // Using UTF-8 Charset
                    writeToFileWithCharset(fileName, content, StandardCharsets.UTF_8);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
}



