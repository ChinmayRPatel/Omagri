package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class TryAndCatchBlock {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
                int[] arr={12,23, 345};
                int a=1;
//                int b =0;
//                int result = a/b;
                System.out.println("Enter the number :- ");
                int xyz = sc.nextInt();
                System.out.println(xyz);
//                System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Exception found "+ a.getMessage());
            a.printStackTrace();
            System.out.println(a.toString());
        }
        catch (IllegalArgumentException iae){
            System.out.println("Illegal argument message "+ iae.getMessage());
            iae.printStackTrace();
        }catch(Exception e){
            System.out.println("Exceptions occur MESSAGE:-- "+e.getMessage());
        }
        finally
        {
            System.out.println("Finally block is executed");
        }
    }
}
