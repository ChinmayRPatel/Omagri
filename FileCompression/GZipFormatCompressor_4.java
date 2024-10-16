package FileCompression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class GZipFormatCompressor_4 {
    public static void compresGZipFile(String sourceFilePath, String destGZipFilePath){
        byte[] buffer = new byte[1024];
        try{
            FileInputStream fileIn = new FileInputStream(sourceFilePath);
            FileOutputStream fileOut = new FileOutputStream(destGZipFilePath);
            GZIPOutputStream gzipOut = new GZIPOutputStream(fileOut);
            int len;
            while((len=fileIn.read(buffer))!=-1){
                gzipOut.write(buffer, 0, len);
            }
            System.out.println("File is compressed successfully");
        }catch (Exception e){
            e.printStackTrace();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String source = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\dir\\subdir\\example.txt";
        String dest = "Gzip_Project.gz";
        compresGZipFile(source, dest);
    }
}
