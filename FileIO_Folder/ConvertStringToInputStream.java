package FileIO_Folder;

import java.io.*;

public class ConvertStringToInputStream {
    public static void main(String[] args) {

        String data = "This is a string that will be converted to InputStream.";
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());

        int byteData;
        try{
            while((byteData=inputStream.read())!=-1){
                System.out.print((char) byteData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

//Another Alternative: Using InputStreamReader
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from InputStream: " + e.getMessage());
        }
    }
}
