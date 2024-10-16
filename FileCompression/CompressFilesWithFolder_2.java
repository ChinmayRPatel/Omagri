package FileCompression;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressFilesWithFolder_2 {

    // Method to compress a folder and its contents into a ZIP file
    public static void compressFolderToZip(File folder, String zipFileName) {
        try (FileOutputStream fos = new FileOutputStream(zipFileName);
             ZipOutputStream zos = new ZipOutputStream(fos)) {
                    // Add the folder and its contents to the zip file
            addFolderToZip(folder, folder.getName(), zos);
            System.out.println("Folder " + folder.getName() + " compressed into " + zipFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Recursive method to add folder and its contents to the ZIP file
    private static void addFolderToZip(File folder, String parentFolder, ZipOutputStream zos) throws IOException {
        // If the file is a directory, add it and recursively traverse its contents
        if (folder.isDirectory()) {
            String folderName = parentFolder + "/";
            zos.putNextEntry(new ZipEntry(folderName));
            zos.closeEntry();

            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                System.out.println("File is "+file.toString());
                    addFolderToZip(file, folderName + file.getName(), zos);
                    System.out.println("-----File = "+file+"FolderName = "+folderName+file.getName() + zos.toString());
                }
            }
        } else {
            // If the file is not a directory, add it to the ZIP file
            try {
                FileInputStream fis = new FileInputStream(folder);
//                ZipEntry zipEntry = new ZipEntry(parentFolder);
                zos.putNextEntry(new ZipEntry(parentFolder));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }

                zos.closeEntry();
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        // Example folder to compress
        File folder = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\abcdefg");

        // Compress the folder into a zip file
        compressFolderToZip(folder, "myFolder.zip");
    }
}
