package FileCompression;

import javax.imageio.stream.FileCacheImageOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressWithFolder_2_practise {
    public static  void compressFolderToZip(File folder, String zipFileName){
        try{
            FileOutputStream fos =new FileOutputStream(zipFileName);
            ZipOutputStream zos =new ZipOutputStream(fos);
            addFolderToZip(folder, folder.getName(), zos);
            System.out.println("***");
        }catch (Exception e){
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    private static  void addFolderToZip(File folder, String parentFolder, ZipOutputStream zos){
        try {
                    if(folder.isDirectory()){
                        String folderName = parentFolder+"/";
                        zos.putNextEntry(new ZipEntry(folderName));
                        zos.closeEntry();
                        File[] files = folder.listFiles();
                        if(files!=null){
                            for (File file : files){
                                addFolderToZip(file, folderName+file.getName(), zos);
                            }
                        }

                    }else{
                        try{
                            FileInputStream fis =new FileInputStream(folder);
                            zos.putNextEntry(new ZipEntry(parentFolder));
                            byte[] buffer = new byte[1024];
                            int len;
                            while((len=fis.read(buffer))!=-1){
                                zos.write(buffer, 0, len);
                            }
                            zos.closeEntry();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\abcdefg");

        compressFolderToZip(folder, "myFolder_duplicate.zip");

    }
}
