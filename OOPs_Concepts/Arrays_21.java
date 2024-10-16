package OOPs_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_21 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2= {11,22, 13};
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< arr.length; i++){
            System.out.println("Enter the value of arr["+i+"] = ");
//            arr[i] = sc.nextInt();
//            Just for test purpose
            arr[i] = 1;
        }
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("***** sorted Array is *****");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] duplicateArr= Arrays.copyOf(arr2, 3);
        System.out.println(Arrays.toString(duplicateArr));
        duplicateArr[1] = -1;
        System.out.println(Arrays.toString(duplicateArr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr2, duplicateArr));

//        2D array
        int[][] twoDimentionArr = new int[3][4];
        for(int i=0; i< 3;i++){
            for(int j=0; j< 4;j++){
                System.out.println("Enter number :-");
                twoDimentionArr[i][j] = sc.nextInt();
            }
        }
        for(int[] i : twoDimentionArr){
            for(int j : i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }


    }
}
