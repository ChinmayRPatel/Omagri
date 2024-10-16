package exceptions;

import java.util.Scanner;

public class ThrowExample_5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try{
            validateAge(sc.nextInt());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//        If age is less than 18 then trow the exception as mentioned in validateAge block
//        validateAge(15);
    }

    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");  // Throwing an exception manually
        } else {
            System.out.println("Welcome to vote!");
        }
    }
}
