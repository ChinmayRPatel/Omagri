package exceptions;

import java.util.Scanner;

public class ThrowExample_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validateAge(sc.nextInt());
//        If age is less than 18 then trow the exception as mentioned in validateAge block
//        validateAge(15);
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");  // Throwing an exception manually
        } else {
            System.out.println("Welcome to vote!");
        }
    }
}
