package Project;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApplication{
    public static void main(String[] args) {
        HashMap<String,Person> personMap = new HashMap<>();
        personMap.put("3", new Person(3, "Abdul K", "Ahmedabad", "21234567890"));
        personMap.put("2", new Person(21, "Babu A", "Jamnagar", "34234567890"));
        personMap.put("1", new Person(32, "Hiren B", "Arvalli", "41234567890"));
        personMap.put("4",new Person(12, "Abhi E", "Mehsana", "12124567890"));
        personMap.put("34",new Person(11, "Hira A", "Ahmedabad", "123456712"));
        personMap.put("5",new Person(1, "Hira A", "Arvalli", "123456712"));

        System.out.println("The Values Are :- ");
        System.out.println(personMap);

        System.out.println("*****Sorting Results *******");

        List<Map.Entry<String, Person>> sortedyName = new LinkedList<Map.Entry<String, Person>>(personMap.entrySet());
        System.out.println("New list of Person Without Sort Is  :-  ****\n "+ sortedyName);

        Collections.sort(sortedyName, (o1, o2)->Integer.valueOf(o1.getValue().getPid()).compareTo(Integer.valueOf(o2.getValue().getPid())));
        System.out.println("Sort By Person Id :- \n"+sortedyName);

        Collections.sort(sortedyName, (o1, o2) -> Integer.valueOf(o2.getValue().getPid()).compareTo(o1.getValue().getPid()));
        System.out.println("Reversed Order By PID Is :-  "+sortedyName);


        Collections.sort(sortedyName, (o1, o2) -> o1.getValue().getName().compareTo(o2.getValue().getName()));
        System.out.println(" Sorted By Prson Name is \n"+sortedyName);

        Collections.sort(sortedyName, (o1, o2) -> o1.getValue().getAddress().compareTo(o2.getValue().getAddress()));
        System.out.println("Sorted By Adress :- \n"+ sortedyName);


        Collections.sort(sortedyName, (o1, o2) -> o1.getValue().getMobileNumber().compareTo(o2.getValue().getMobileNumber()));
        System.out.println("Sorted By Mobile number is :-\n" + sortedyName);

        System.out.println("***** Filtered Data From 10 to 20 Pid\n");
        filterDataByPersonIdy(10, 20, personMap);

        System.out.println("***** Filtered Data From Ahmedabad City\n");
        filterDataByPersonAddress("Ahmedabad", personMap);

        System.out.println("***** Filtered Data By Key \n");
        filterDataByPersonKey("1", personMap);

        System.out.println("***** Filtered Data By Moile Number  City\n");
        filterDataByPersonMobile("12124567890", personMap);

        System.out.println("***** Filtered Data By Peson Name \n");
        filterDataByPersonName("Abdul K", personMap);



    }

    public static void filterDataByPersonIdy(int from, int to, HashMap<String, Person> hmap){
        if(!hmap.isEmpty()){
             List<Person> personFiltered = hmap.entrySet().stream()
                     .filter(entry->entry.getValue().getPid() <=to && entry.getValue().getPid() >= from)
                     .map(Map.Entry::getValue)
                     .sorted((o1, o2) -> Integer.valueOf(o1.getPid()).compareTo(o2.getPid()))
                     .collect(Collectors.toList());
            System.out.println(personFiltered);
        }
        else{
            return;
        }
    }

    public static void filterDataByPersonName(String name, HashMap<String, Person> hmap){
        if(!hmap.isEmpty()) {
            List<Person> personFiltered = hmap.entrySet().stream()
                    .filter(entry->entry.getValue().getName().equalsIgnoreCase(name) )
                    .map(Map.Entry::getValue)
                    .sorted((o1, o2) -> Integer.valueOf(o1.getPid()).compareTo(o2.getPid()))
                    .collect(Collectors.toList());
            System.out.println(personFiltered);
        }
    }

    public static void filterDataByPersonAddress(String address , HashMap<String, Person> hmap){

        if(!hmap.isEmpty()) {
            List<Person> personFiltered = hmap.entrySet().stream().filter(entry -> entry.getValue().getAddress().equalsIgnoreCase(address))
                    .map(Map.Entry::getValue)
                    .sorted((o1, o2) -> Integer.valueOf(o1.getPid()).compareTo(o2.getPid()))
                    .collect(Collectors.toList());
            System.out.println(personFiltered);
        }
    }

    public static void filterDataByPersonMobile(String mobileNum,  HashMap<String, Person> hmap){
        if(!hmap.isEmpty()) {
            List<Person> personFiltered = hmap.entrySet().stream().filter(entry -> entry.getValue().getMobileNumber().equalsIgnoreCase(String.valueOf(mobileNum)))
                    .map(Map.Entry::getValue)
                    .sorted((o1, o2) -> Integer.valueOf(o1.getPid()).compareTo(o2.getPid()))
                    .collect(Collectors.toList());
            System.out.println(personFiltered);
        }
    }
    public static void filterDataByPersonKey(String k, HashMap<String, Person> hmap){
        if(!hmap.isEmpty()) {
            List<Person> personFiltered = hmap.entrySet().stream().filter(entry -> entry.getKey().equals(k))
                    .map(Map.Entry::getValue)
                    .sorted((o1, o2) -> Integer.valueOf(o1.getPid()).compareTo(o2.getPid()))
                    .collect(Collectors.toList());
            System.out.println(personFiltered);
        }
    }


}
