package CollectionPrograms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MergingCollections {
    public static void main(String[] args) {
//*********Add all of set
        HashSet<String> a = new HashSet<>();
        a.add("A");
        a.add("Ab");
        a.add("Ac");
        HashSet<String> b = new HashSet<>();
        b.add("BAd");
        b.add("BAe");
        b.add("BAs");
        b.add("BAa");
        System.out.println(a.addAll(b));
        System.out.println(a);
//******** Add All of LinkedList or Array List
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("A");
        l1.add("A");
        l1.add("A");
        l1.add("A");
        LinkedList<String> l2 = new LinkedList<>();
        l2.add("B");
        l2.add("B");
        l2.add("B");
        l2.add("B");
//        ** Using the Add All method of collection
        l1.addAll(l2);
        System.out.println(l1);

//        * Using stream API
        List<String> aList
                = l1.stream().collect(Collectors.toList());
        System.out.println(aList);


    }
}
