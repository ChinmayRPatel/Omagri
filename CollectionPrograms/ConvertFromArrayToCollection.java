package CollectionPrograms;

// Convert an Array into Collection in Java

// import java util library
import java.util.*;

public class ConvertFromArrayToCollection {
    public static void main(String args[])
    {
        String playersArray[] = { "Virat", "Sachin", "Rohit", "Bumrah" };

        // printing input elements for comparison
        System.out.println("Array input: "+ Arrays.toString(playersArray));

        // converting array into Collection
        // with asList() function
        List playersList = Arrays.asList(playersArray);

        // print converted elements
        System.out.println("Converted elements: "+ playersList);

        String[] nameArr = {"Abc", "Bcd", "Xyz"};
        ArrayList<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, nameArr);
        System.out.println("Converted name ARRAY TO NAME LIST"+nameList.toString());

        String countryArray[]= { "India", "Pakistan", "Afganistan","Srilanka" };

        List<String> countryList= new ArrayList<>(List.of(countryArray));

        System.out.println("Converted ArrayList elements: "+ countryList);

    }
}
