package FileIO_Folder.ImageEncryptAndDecrypt;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageOperations {


//

    private static final String ALGORITHM = "AES"; // Define AES algorithm

    // Encrypt the file and overwrite it
    public static void encryptFile(String key, File inputFile) throws Exception {

        // Create AES cipher
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Create a temporary file to store encrypted content
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");

        // Set up streams for encryption
        FileInputStream inputStream =  new FileInputStream(inputFile);
        FileOutputStream tempOutputStream = new FileOutputStream(tempFile);
        CipherOutputStream cipherOutputStream = new CipherOutputStream(tempOutputStream, cipher);

        try {

            // Encrypt the content and write to the temp file
            byte[] buffer = new byte[inputStream.available()];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                cipherOutputStream.write(buffer, 0, bytesRead);
//                System.out.println("-"+bytesRead+"-");
//                System.out.println("\n-="+Arrays.toString(buffer)+"-=");
            }

        } finally {
            // Close all streams
            if (inputStream != null) inputStream.close();
            if (cipherOutputStream != null) cipherOutputStream.close();
            if (tempOutputStream != null) tempOutputStream.close();
        }

        // Replace the original file with the encrypted file
        if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
            throw new IOException("Failed to replace original file with encrypted file.");
        }

        System.out.println("File encrypted and overwritten successfully!");
    }
//
    // Decrypt the file and overwrite it
    public static void decryptFile(String key, File inputFile) throws Exception {
        // Create AES cipher
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Create a temporary file to store decrypted content
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");

        // Set up streams for decryption
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream tempOutputStream = new FileOutputStream(tempFile);
        CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);

        try {

            // Decrypt the content and write to the temp file
            byte[] buffer = new byte[inputStream.available()];
            int bytesRead;
            while ((bytesRead = cipherInputStream.read(buffer)) != -1) {
                tempOutputStream.write(buffer, 0, bytesRead);
            }
        } finally {
            // Close all streams
            if (cipherInputStream != null) cipherInputStream.close();
            if (inputStream != null) inputStream.close();
            if (tempOutputStream != null) tempOutputStream.close();
        }

        // Replace the original file with the decrypted file
        if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
            throw new IOException("Failed to replace original file with decrypted file.");
        }

        System.out.println("File decrypted and overwritten successfully!");
    }



    public static void operate(String key){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();

        try {
            encryptFile(String.valueOf(key), file);
//            decryptFile(key, file);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Image Operations ");
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        Font font = new Font("Roboto", Font.BOLD, 12);

        JButton button = new JButton();
        button.setText("Open Image");
        button.setFont(font);

        JTextField textField = new JTextField(50);
        textField.setFont(font);
        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(textField);

        button.addActionListener(e -> {
            System.out.println("Button Clicked");
            String text = textField.getText();
            String temp = text.toString();
            operate(temp);
        });
        f.setVisible(true);
    }
}
