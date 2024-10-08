package CollectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapStrIntExample {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        
        // add the elements in hash map
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 500);
        hm.put("d", 600);
        hm.put("f", 700);
        
        System.out.println(hm.toString());
        // print the element of hash map using the Entry class of map interface
        for(Map.Entry<String, Integer> i:hm.entrySet()){
        	System.out.printf(i.getKey()+" Is key of:  ");
        	System.out.println(i.getValue());
        }
        
        hm.put("b", 12);	// update the key "b" with 12
        
//        delete / remove the element with key
        hm.remove("a");
        System.out.println(hm.toString());
        System.out.println(hm.toString());
        Integer x=12;
        for(Map.Entry<String , Integer> a: hm.entrySet()) {
        	if(a.getValue().equals(x)) {
        		System.out.println("Key = "+ a.getKey() + " = value = "+ a.getValue());
        		System.out.println();
        	}
        }
        
    }
}
