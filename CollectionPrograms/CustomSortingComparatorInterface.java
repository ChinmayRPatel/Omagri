package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSortingComparatorInterface {
    int age ;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CustomSortingComparatorInterface(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return " Name = "+this.name + "  age = "+ this.age;
    }
    public static void main(String[] args) {
        List<CustomSortingComparatorInterface> lst = new ArrayList<>();
        lst.add(new CustomSortingComparatorInterface(32, "Wcb"));
        lst.add(new CustomSortingComparatorInterface(121, "Acb"));
        lst.add(new CustomSortingComparatorInterface(21, "Acb"));
        lst.add(new CustomSortingComparatorInterface(11, "Acb"));
        lst.add(new CustomSortingComparatorInterface(543, "ZZcb"));
        lst.add(new CustomSortingComparatorInterface(21, "Bcb"));
        lst.add(new CustomSortingComparatorInterface(45, "Xcb"));
        System.out.println(lst.toString());
       Collections.sort(lst, new Comparator<CustomSortingComparatorInterface>() {
           @Override
           public int compare(CustomSortingComparatorInterface o1, CustomSortingComparatorInterface o2) {
               return o1.name.compareTo(o2.name);
           }
       });
        System.out.println(" Sorted by name is data are :- ");
//        System.out.println(lst.toString());
        System.out.println(lst);

        System.out.println(" Sorted by Age  is data are :- ");
        Collections.sort(lst, (o1, o2)->Integer.compare(o1.getAge(), o2.getAge()));
        System.out.println(lst);


        System.out.println("First srt by name and then same name then age ;-- ");
        // Custom sorting first by name, then by age
        lst.sort(Comparator.comparing(CustomSortingComparatorInterface::getName).thenComparing(CustomSortingComparatorInterface::getAge));

        System.out.println(lst);


//
        // Comparator to sort by name
        Comparator<CustomSortingComparatorInterface> byName = (e1, e2) -> e1.getName().compareTo(e2.getName());

// Comparator to sort by salary
        Comparator<CustomSortingComparatorInterface> bySalary = (e1, e2) -> Double.compare(e1.getAge(), e2.getAge());

    }
}
