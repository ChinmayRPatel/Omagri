package FileIO_Folder;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ConvertInputStreamToString {
    public static void main(String[] args) {
        // Example InputStream
        InputStream inputStream = new ByteArrayInputStream("Hello, InputStream!".getBytes());

        // Convert InputStream to String using Scanner directly in main
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        String result = scanner.useDelimiter("\\A").next(); // "\\A" is the beginning of the input boundary
        scanner.close();

        // Print the result
        System.out.println(result);
    }
}