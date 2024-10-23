package Generics.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPerson {
    public static void main(String[] args) {

        List<Person> lstPerson =  new ArrayList<Person>();
        lstPerson.add(new Person(1, "One", "OneAdd"));
        lstPerson.add(new Person(2, "Two", "Two Add"));
        lstPerson.add(new Person(3, "Three", "Three Add"));
        lstPerson.add(new Person(4, "Four", "Four Add"));
        lstPerson.add(new Person(5, "Five", "Fifth Add"));
        System.out.println(lstPerson);

        Person personqithIndex1 = lstPerson.get(1);
        System.out.println(personqithIndex1);


        System.out.println(lstPerson.contains(lstPerson.get(1)));



    }
}
