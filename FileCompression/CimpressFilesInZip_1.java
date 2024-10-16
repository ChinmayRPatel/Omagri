package FileCompression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CimpressFilesInZip_1 {
    public static void compressToZip(File[] files, String zipFileName){
        try{
//            Creating the zip out put stream for write zip file
            FileOutputStream fos = new FileOutputStream(zipFileName);
            ZipOutputStream zos = new ZipOutputStream(fos);
            for(File file:files){
                if(file.isFile()){
                    FileInputStream fis = new FileInputStream(file);

//                    Add zip entry for each file
//                    ZipEntry zipEntry =  new ZipEntry(file.getName());
                    zos.putNextEntry(new ZipEntry(file.getName()));
                    byte[] buffer = new byte[1024];
                    int length;
                    while((length=fis.read(buffer))>0){
                        zos.write(buffer, 0, length);
                    }
                    zos.closeEntry();
                    fis.close();
                }
            }
            zos.close();;
            fos.close();
            System.out.println("File is compressed successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        // Example files to be compressed
        File file1 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri");
        File file2 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri");

        // Compress the files into "compressed_files.zip"
        compressToZip(new File[] { file1, file2 }, "compressed_files.zip");
    }
}
