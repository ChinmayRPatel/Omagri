package FileSerialization;

import FileSerialization.object.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Alok", 12);
        Person p2 = new Person(1, "Alok", 12);
        Person p3 = new Person(1, "Alok", 12);
        Person p4 = new Person(1, "Alok", 12);
        Person p5 = new Person(1, "Alok", 12);
        Person p6 = new Person(1, "Alok", 12);
        try{
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(p1);
            outputStream.writeObject(p2);
            outputStream.writeObject(p3);
            outputStream.writeObject(p4);
            outputStream.writeObject(p5);
            outputStream.writeObject(p6);
            System.out.println("Person is added successfully :-\n");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
