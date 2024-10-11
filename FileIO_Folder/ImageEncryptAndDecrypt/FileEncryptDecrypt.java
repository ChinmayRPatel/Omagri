package FileIO_Folder.ImageEncryptAndDecrypt;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Arrays;

public class FileEncryptDecrypt {

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

    public static void main(String[] args) throws Exception {
        String key = "1234567890123456"; // Sample 16-byte key for AES
        File inputFile = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\UTF_8\\UTF_8.txt");

        // Encrypt the file
//        encryptFile(key, inputFile);
//        System.out.println("Encryption complete.");

        // Decrypt the file
        decryptFile(key, inputFile);
        System.out.println("Decryption complete.");
    }
}

//        File inputFile = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\abcd.txt");
//        File encryptedFile = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\encryptedfile.aes");
//        File decryptedFile = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileIO_Folder\\writedFile\\decrypted.txt");
