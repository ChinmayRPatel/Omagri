package Project2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Address> addressMap = new HashMap<>();
        addressMap.put(1, new Address(1, "Ahmedabad", "Gujarat"));
        addressMap.put(2, new Address(2, "Bengaluru", "Karnataka"));
        addressMap.put(3, new Address(3, "Chennai", "Tamil Nadu"));

        // Step 2: Create a map for storing students by their ID, linking them with addresses
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "Abdul K", 1,addressMap.get(1)));
        studentMap.put(2, new Student(2, "Rahul R",5,  addressMap.get(2)));
        studentMap.put(3, new Student(3, "Sneha S", 4, addressMap.get(3)));

        System.out.println("Enter the value of student Id ");


        // Fetch student with ID 2 and their associated address
        Student student = studentMap.get(1);  // Fetch student with ID 2
        if (student != null) {
            System.out.println("Fetched Student:\n " + student);
            System.out.println("Address of Student ID 1:\n " + student.getAddress());
        } else {
            System.out.println("******Student not found!****8");
        }
    }
}
