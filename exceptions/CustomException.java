package exceptions;

import java.io.IOException;

class InvalidAgeException extends Exception{
    int code=0;
    public InvalidAgeException(String msg, int code){
        super(msg);
        this.code = code;
    }
}

public class CustomException extends Throwable {
    public static void main(String[] args) throws IOException {
        try
        {
            int a =20;
            int b =10;//for check custom exception
            check(a);
            check(b);
        }catch (InvalidAgeException e){
            System.out.println("InvalidAgeException is occur "+ e.getMessage()+"Error code is =  "+e.code);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static  void check(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age is less than 18 , which is not valid for vote", 413);
        }else{
            System.out.println("You are eligible");
        }
    }
}

