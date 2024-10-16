package CollectionPrograms.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fruits implements Comparable<Fruits> {
    private int id;
    private String name;
    private String test;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", test='" + test + '\'' +
                '}'+"\n";
    }

    public Fruits(int id, String name, String test){
        this.id = id;
        this.name = name;
        this.test = test;
    }

    public static void main(String[] args) {
        List<Fruits> listFruits = new ArrayList<>();
        listFruits.add(new Fruits(1, "Abc", "Xyz"));
        listFruits.add(new Fruits(2, "Bbc", "Kyz"));
        listFruits.add(new Fruits(6, "Abc", "Myz"));
        listFruits.add(new Fruits(4, "Dbc", "Wyz"));
        listFruits.add(new Fruits(4, "Dbc", "Xyz"));
        listFruits.add(new Fruits(7, "Dbc", "Yyz"));
        listFruits.forEach((f -> {
            System.out.println(f.getId() + " Is id of "+ f.getName() +" test is "+ f.getTest());
        }));
//        Default Comparator from List (Fruits)class
        Collections.sort(listFruits);
        System.out.println("After the sorting  by Fruit name :-  ");

        listFruits.forEach((f -> {
            System.out.println(f.getId() + " Is id of "+ f.getName() +" test is "+ f.getTest());
        }));

//        Custom Sorting which is only in this sort by you mentioned
        Collections.sort(listFruits, (o1, o2)->o1.getTest().compareTo(o2.getTest()));

        System.out.println("Sorted By Test of fruits :- ");
        System.out.println(listFruits.toString());

//        Custom sorting by Id
        Collections.sort(listFruits, (a1, a2)-> Integer.valueOf(a1.getId()).compareTo(Integer.valueOf(a2.getId())));
        System.out.println("After the fruits sort by id ");
        System.out.println(listFruits.toString());

//        Using Custom Comparator First comparing by Id and then Comparing with Test
        listFruits.sort(Comparator.comparing(Fruits::getId).thenComparing(Fruits::getTest));
        System.out.println(listFruits);


    }


    @Override
    public int compareTo(Fruits o) {
//        Fruits f = (Fruits) o;
        return this.name.compareTo(o.name);

    }

//    Below is for comparing by the fruitId
//    public int compareTo(Fruits o) {
//        Fruits f = (Fruits) o;
//        return this.id - o.id;
//    }
}
