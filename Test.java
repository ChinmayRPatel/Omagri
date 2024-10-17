import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // Start the timer
        long startTime = System.currentTimeMillis();  // Can also use System.currentTimeMillis()

        // Loop to count from 1 to 1 billion
        for (long i = 1; i <= 100000L; i++) {
            // Do nothing, just count
            System.out.print(i);
        }

        // End the timer
        long endTime = System.currentTimeMillis();  // Can also use System.currentTimeMillis()

        // Calculate the time taken in seconds
        long timeTaken = (endTime - startTime);  // Convert nanoseconds to seconds

        System.out.println("Time taken to count to 1 billion: " + timeTaken + " seconds");
        List<Integer> lst = new ArrayList<>();
        lst.add(12);
        lst.add(112);
        lst.add(1122);
        lst.add(1232);
        lst.add(21);
        List<Integer> updated= lst.stream().filter(a -> a>100).toList();
        System.out.println(updated);

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("One", 1);
        lhm.put("Three", 3);
        lhm.put("Fout", 4);
        lhm.put("Two", 2);
        lhm.put("Tfour", 24);
        LinkedHashMap<String, Integer> entry = lhm.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o,n)->o,
                        LinkedHashMap::new
                ));


        System.out.println(entry);

        lhm.forEach((s, i) -> System.out.print(", " + s + " "+i) );
        Iterator<Map.Entry<String, Integer>> entryIterator=lhm.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> e=entryIterator.next();
            System.out.println(e.getKey() + " "+ e.getValue());
        }

        LinkedHashMap<String, Integer> sorted = lhm.entrySet().stream()
                .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
//                .filter(entry1 -> entry1.getValue()> 18)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,n)->0, LinkedHashMap::new));
        System.out.println(sorted);


        ArrayList<String> al = new ArrayList<>() ;
        al.add("ASd");
        al.add("BSd");
        al.add("SSd");
        al.add("AAASdx");
        List<String> ll1 = al.stream().filter(s->s.endsWith("d")).sorted((o1, o2)->o1.compareTo(o2)).toList();
        System.out.println(ll1);


        Map<Integer,String> m=new HashMap<>();
        m.put(1, "one");
        m.put(2, "two");
        m.put(3, "three");
        m.put(4, "four");
        m.put(5, "five");

        LinkedHashMap<Integer, String> vr = m.entrySet()
                .stream()
                .map(entry1 -> Map.entry(entry1.getKey()*2, entry1.getValue().replaceAll(entry1.getValue(), "AAAAAAAA"))) // Replace each entry's value with "AAA"
                .collect(Collectors.toMap(
                        Map.Entry::getKey, // Keep the original key
                        Map.Entry::getValue, // The new value ("AAA")
                        (oldValue, newValue) -> oldValue, // In case of conflict, keep the old value
                        LinkedHashMap::new // Collect into a LinkedHashMap to preserve insertion order
                ));
        System.out.println(vr);
        int[] arr = {1, 34, 12, 24 ,23,4 ,23,4 ,23, 423 ,4,23 ,4,234, 23,423 ,4};
        for(int i=0; i< arr.length;i++){
            if(arr[i]==12){
                System.out.println(" ** "+i);
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> lasd =Arrays.stream(arr).boxed().toList();
        List<Integer> arrlst = Arrays.asList( 7, 34, 12, 24 ,23,4 ,23,4 ,23, 423 ,4,23 ,4,234, 23,423 ,4);
        System.out.println(arrlst);

        System.out.println(lasd);

        String[] arrmutable= {"123","12","34 ,1234,2 ,35123,4 ,124,1 ,351235"};
        ArrayList<String> namesList =new ArrayList<>(Arrays.stream(arrmutable).toList());
        System.out.println(namesList);
        namesList.add(1, "-0-09sd0-fg");
        System.out.println(namesList);



    }

}
