package FileIO_Folder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageExtensionChange {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\dir\\subdir\\createdByNois\\download (1).jpg");
            BufferedImage img = ImageIO.read(file);
            System.out.println(img.toString());
            System.out.println("Size of image : - "+file.length());
            System.out.println("Height of image : - "+img.getHeight());
            System.out.println("Width of image : - "+img.getWidth());
            img.flush();
            System.out.println("Flushed image");
            File file2 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\UTF_8\\img.jpg");
            ImageIO.write(img, "jpg",file2);
            File file3 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\UTF_8\\img.png");
            ImageIO.write(img, "png",file3);
            File file4 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\UTF_8\\img.gif");
            ImageIO.write(img, "gif",file4);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
