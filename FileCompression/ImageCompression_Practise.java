package FileCompression;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;

public class ImageCompression_Practise {
    public static void main(String[] args) {
        try{
            BufferedImage bi = ImageIO.read(new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\Images\\compressed.jpg"));
            Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
            ImageWriter writer  = writers.next();

            File output=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\Images\\compressed_practice.jpg");
            ImageOutputStream ios = ImageIO.createImageOutputStream(output);
            writer.setOutput(ios);

            ImageWriteParam params = writer.getDefaultWriteParam();
            params.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            params.setCompressionQuality(1.0f);
            writer.write(null, new IIOImage(bi, null, null), params);

            System.out.println("Image is compressed successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
