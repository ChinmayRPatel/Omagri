package FileSerialization;

import FileSerialization.object.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObjectToFile {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Alok", 12);
        Person p2 = new Person(2, "Blok", 12);
        Person p3 = new Person(3, "Clok", 12);
        Person p4 = new Person(4, "Dlok", 12);
        Person p5 = new Person(5, "Elok", 12);
        Person p6 = new Person(6, "Flok", 12);

        try{
            List<Person> personList = new ArrayList<>();
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            personList.add(p4);
            personList.add(p5);
            personList.add(p6);


            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileSerialization\\object\\person.ser", true);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(personList);
            System.out.println("Person is added successfully :-\n");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
