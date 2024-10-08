package CollectionPrograms;

import java.util.Arrays;

public class Array121212 {
    public static void main(String[] args) {
        try{
            int[] arr = {12,1, 23, 45};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
