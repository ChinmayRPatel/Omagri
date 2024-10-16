package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
//Array list is not thread safe
//if you are concurrently change the data then it will show an error that arraylist is not defined
//use the concurent ArrayList for above problem

//Its best for find the the value by index number
//not good for search by value because it will take O(n) time for linear search to element

//it good in resible
//its not good in insertion and deletion and random place
//its all operations are at the end of data then arraylist is use ful
public class ArrayList1_Example {
    public static void main(String[] args) {
        try{
                    ArrayList<Integer> arr = new ArrayList<Integer>();
        //        ArrayList<Integer> arr = new ArrayList<>();
                for(int i=0; i< 10 ;i++){
                    arr.add(i+1);
                }
                Iterator iterator=arr.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                arr.remove(5);  //This will remove at the index number 5
                arr.remove(Integer.valueOf(1)); // this will remove the value of 1 which is persent in arrayylist at index at 0 now
                System.out.println(arr.toString()); // this will print the array in by collection toStrnig method

                System.out.println(arr.size()); // return the size of arr
                System.out.println(arr.contains(1)); // return the boolean if containe  = false because i have remove 1
                System.out.println(arr.contains(2)); // return the boolean if containe  = true because it ha the value of 2

                ArrayList<Integer> a1 = new ArrayList<>();
                a1.add(12);
                a1.add(133);
                arr.addAll(a1); // this will add the array list a1 to end of the arr arraylist
                System.out.println(arr.toString());

                arr.set(1, 11);//here we have se 11 at the index number 1
                System.out.println(arr.toString());

                System.out.println(arr.indexOf(1));
                System.out.println(arr.lastIndexOf(12));
                System.out.println(arr.subList(0,5).toString());    // this will return the arr from index 0 to 5 where 5 is excluded
                arr.clear();// which will clear the while arraylist
                System.out.println(arr);

            }
        catch (Exception e){
        System.out.println(e.getMessage());
    }

    }

}
