package FileIO_Folder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class FileReadWithBufferInputStream {
    public static void main(String[] args) {
        try{

        File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\WritedData.txt");

//        *********** 1st Way to read from file *******************
//            1. BufferedReader class for Reading text file
        //File Read using BufferReader
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = "";
        while((st=br.readLine())!=null) {
            System.out.println(st);
        }


//        *********** 2nd Way t o read from file *******************
//            2. FileReader class for Reading text file
            System.out.println("***2. Read file using FileReader class****");
            FileReader fr = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\WritedData.txt");
            int i;

            while ((i=fr.read())!=-1){
                System.out.print((char)i);
            }


//            ********************3rd way to read from file ***********
//            3. Scanner class for reading text file
            // pass the path to the file as a parameter
            File fscan = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\WritedData.txt");
            Scanner sc = new Scanner(fscan);
            System.out.println("*****3. Read from file using the Scanner class ******");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

//            Without using the loop in scanner
            // we just need to use \\Z as delimiter
//            sc.useDelimiter("\\Z");
//            System.out.println(sc.next());

            System.out.println("*****4. Way to read from list using the list iterator");
            List<String> lines = Collections.emptyList();
            lines = Files.readAllLines(Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\WritedData.txt"), StandardCharsets.UTF_8 );
            ListIterator<String> iterator = lines.listIterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

//          *********5th way to read from file*********
            System.out.println("*****5. Read file using the Files.readAllBytes ");
            String data="";

            data = new String(Files.readAllBytes(Paths.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\WritedData.txt")));
            System.out.println(data);



//            *****************************Read the files by BufferedInputStreamReader **************************************
            System.out.println("**** File read By BufferedInputStream********");
            // Create input stream '*.txt' for reading containing text
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\WritedData.txt");

            // Convert inputStream to  bufferedInputStream
            BufferedInputStream buffInputStr = new BufferedInputStream(inputStream);
            System.out.println((char)buffInputStr.read());

            // Read until a single byte is available
            while (buffInputStr.available() > 0) {

                // Read the byte and  convert the integer to character
                char c = (char)buffInputStr.read();

                // Print the characters
//                System.out.print("Char : " + c);
                System.out.print(c);

            }
//            System.out.println("Using the Buffered InputStream");
//            // Read number of bytes available
//            int rem_byte = buffInputStr.available();
//
//            // Byte array is declared
//            byte[] barr = new byte[rem_byte];
//
//            // Read byte into barr,
//            // starts at offset 1,
//            // 5 bytes to read
//            buffInputStr.read(barr, 1, 5);
//
//            // For each byte in barr
//            for (byte b : barr) {
//                if (b == (byte)0)
//                    b = (byte)'-';
//                System.out.print((char)b);
//            }
            br.close();
            fr.close();
            buffInputStr.close();
        }
    catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (Exception ex){
            System.out.println(ex.getMessage());
    }
    }
}
