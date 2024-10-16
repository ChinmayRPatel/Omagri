package FileCompression;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;

public class ImageCompression {

    //    public static BufferedImage resizeImage(BufferedImage originalImg, int target)
    public static void main(String[] args) {

        try{
            String inputPath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\Images\\download.jpg";
            String outputPath = "C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\Images\\compressed.jpg";

            File inputFile = new File(inputPath);

            BufferedImage inputImage = ImageIO.read(inputFile);

            Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
            ImageWriter writer = writers.next();

            File outputFile = new File(outputPath);
            ImageOutputStream outputStream = ImageIO.createImageOutputStream(outputFile);

            writer.setOutput(outputStream);

            ImageWriteParam params = writer.getDefaultWriteParam();
            params.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            params.setCompressionQuality(0.05f);

            writer.write(null, new IIOImage(inputImage, null, null), params);

            outputStream.close();
            writer.dispose();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
