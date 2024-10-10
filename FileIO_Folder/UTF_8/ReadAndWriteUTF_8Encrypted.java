package FileIO_Folder.UTF_8;

import java.io.*;
import java.util.Base64;

public class ReadAndWriteUTF_8Encrypted {
    public static void main(String[] args) {
//        try{
//            File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\UTF_8\\UTF_8.txt");
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            String content = "This is th encoded text whixh is encoded in UTF-8 encoder";
//            String encodedText = Base64.getEncoder().encodeToString(content.getBytes("UTF-8"));
//            fileOutputStream.write(encodedText.getBytes());
//            System.out.println("File created with charset: " + encodedText);
//            System.out.println("File data is inserted successfully nserted in file ");
//
//
//
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }

//********************** this is read the encoded file encoding in utf_8

        try{
            File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\UTF_8\\UTF_8.txt");
            BufferedReader br  = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String str = "";
            while((str = br.readLine())!=null){
                stringBuilder.append(str);
            }
            System.out.println("This is string builder "+stringBuilder.toString());
            byte[] bytes= Base64.getDecoder().decode(stringBuilder.toString());
            String decodedtext = new String(bytes, "UTF-8");
            System.out.println("\n***Decoded text is ***\n "+decodedtext);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }
}
