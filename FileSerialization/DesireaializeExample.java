package FileSerialization;

import FileSerialization.object.Person;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DesireaializeExample {
    public static void main(String[] args) {
        Person person = null;
        try{

            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
//            byte[] bytes = ois.readAllBytes();
//            for(byte b: bytes){
//                System.out.println((char) b);
//            }

                person = (Person) ois.readObject();  // Deserialize the object

                System.out.println("Object has been deserialized");
                System.out.println(person);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
