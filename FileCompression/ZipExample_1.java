//package FileCompression;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipInputStream;
//import java.util.zip.ZipOutputStream;
//
//public class ZipExample_1 {
//    public static void main(String[] args) {
//        compresstozip();
//
//
//    }
//    public static void deCompersstozip(Path zipFile, Path outerFile){
//        try {
//            ZipInputStream zis = new ZipInputStream(Files.newInputStream(zipFile));
//            ZipEntry ze = zis.getNextEntry();
//            while (ze!=null){
//                Path outputFile = outerFile.resolve(ze.getName());
//                Files.copy(zis, outputFile);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static void compresstozip(Path outputFile, Path... fileToZip){
//
//        try {
//            ZipOutputStream zose = new ZipOutputStream(Files.newOutputStream(outputFile));
//            for(Path file : fileToZip){
//                ZipEntry ze = new ZipEntry(file.getFileName().toString());
//                zose.putNextEntry(ze);
//                Files.copy(file, zose);
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
