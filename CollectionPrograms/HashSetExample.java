package CollectionPrograms;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        try{
            HashSet<String> hs = new HashSet<>();
            hs.add("Hey0");
            hs.add("Hey0");
            hs.add("Hey1");
            hs.add("Hey0");
            hs.add("Hey2");
            hs.add("Hey2");
            hs.add("Hey3");
            hs.add("Hey4");
            System.out.println(hs.toString());
            hs.remove("Hey0");
            System.out.println("Hey 0 in set  =  "+hs.contains("Hey0"));
            System.out.println(hs.size());// for check the size of hash set

       }
        catch (Exception e){
        System.out.println(e.getMessage());
    }

    }
}
