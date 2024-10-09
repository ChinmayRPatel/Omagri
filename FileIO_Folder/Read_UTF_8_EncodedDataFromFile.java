package FileIO_Folder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Read_UTF_8_EncodedDataFromFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\abc.txt";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8")) ;
                String line;

                // Read each line of the file
            while((line =br.readLine())!=null){
                    System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
//*********************** Other method to read the encoded f=data from the file *******************
        // Specify the file path
//        Path filePath = Paths.get("C:\\path\\to\\your\\utf8file.txt");

        try {
            // Read all lines at once
            List<String> lines = Files.readAllLines(Path.of(filePath), StandardCharsets.UTF_8);


            // Print each line
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
