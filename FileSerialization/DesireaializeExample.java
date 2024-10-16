package FileSerialization;

import FileSerialization.object.Person;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class DesireaializeExample {
    public static void main(String[] args) {
        Person person = null;
        try{

            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\FileSerialization\\object\\person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

                List<Person> personList = (List<Person>)ois.readObject();
                System.out.println("Object has been deserialized");
                for(Person p:personList){
                    System.out.println(p);
                }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
