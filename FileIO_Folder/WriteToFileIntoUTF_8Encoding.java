package FileIO_Folder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class WriteToFileIntoUTF_8Encoding {
            public static void writeToFileWithCharset(String fileName, String content, Charset charset)
            {
                try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                     OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, charset))
                {
                    // writing content to the file
                    outputStreamWriter.write(content);

                    System.out.println("File created with charset: " + charset);
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            // Main Function
            public static void main(String args[])
            {
                try{
                    String fileName = "output.txt";
                    String content = "Hello, this is a file with a specific charset.\nThis is an utf-8 encoded \n this is 3rd line ";

                    // Using UTF-8 Charset
                    writeToFileWithCharset(fileName, content, StandardCharsets.UTF_8);

                    // Using ISO-8859-1 Charset
                    writeToFileWithCharset(fileName, content, Charset.forName("ISO-8859-1"));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
}



