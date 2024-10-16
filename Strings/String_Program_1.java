package Strings;

public class String_Program_1 {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = " Hello, World! ";

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // Character at index
        System.out.println("Character at index 4: " + str1.charAt(4));

        // Substring
        System.out.println("Substring from index 7: " + str1.substring(7));

        // Concatenation
        String str3 = str1 + " Welcome to Java!";
        System.out.println("Concatenated string: " + str3);

        // Trim
        System.out.println("Trimmed str2: '" + str2.trim() + "'");

        // Replace
        String replaced = str1.replace("World", "Java");
        System.out.println("Replaced string: " + replaced);

        // Check if contains
        System.out.println("Does str1 contain 'Hello'? " + str1.contains("Hello"));

        String[] parts = str1.split(", "); // Splits by comma and space
        for(String s : parts){
            System.out.println(s);
        }
        String addedstr=str1.concat(str2);  // concate the string
        System.out.println(addedstr);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2); // Output: Hello World

    }
}
