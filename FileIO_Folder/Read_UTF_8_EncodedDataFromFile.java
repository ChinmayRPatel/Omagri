package FileIO_Folder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

public class Read_UTF_8_EncodedDataFromFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\output.txt";

        try {
            File f = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(f));
            StringBuilder stringBuilder = new StringBuilder();

            String str = "";
            while((str = br.readLine())!=null){
                stringBuilder.append(str);
            }
            System.out.println("This is string builder "+stringBuilder.toString());
//            System.out.println(str);
            byte[] bytes= Base64.getDecoder().decode(stringBuilder.toString());
            String decodedtext = new String(bytes, "UTF-8");
            System.out.println("Decoded text is :- "+decodedtext);
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
