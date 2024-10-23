package FileCompression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class DeSerializeCompressedFromGZip {
    public static List<Student> deserializedStudent(String filepath){
        try {
            FileInputStream fis = new FileInputStream(filepath);
            GZIPInputStream zis = new GZIPInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(zis);
            Object obj = ois.readObject();
//            List<Student> s = (List<Student>) ois.readObject();
            return (List<Student>)obj;

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        List<Student> s =deserializedStudent("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\objectCompressorStudent_2.gz");
//        for(Student student : s){
            System.out.println(s.toString());
//        }

    }
}
