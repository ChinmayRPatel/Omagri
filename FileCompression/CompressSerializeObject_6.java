package FileCompression;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public class CompressSerializeObject_6 {

    public static void compressObjectsToFile(String filepath , List<Student> studentList){
        try{
            FileOutputStream fos = new FileOutputStream(filepath);
            GZIPOutputStream zos = new GZIPOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(zos);
            oos.writeObject(studentList);
            System.out.println("Objects have been serialized and compressed successfully.");


        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student(1, "Abcd", "Ahmedabad"));
        students.add(new Student(2, "Bbcd", "Baroda"));
        students.add(new Student(1, "Abcd", "Ahmedabad"));
        students.add(new Student(2, "Bbcd", "Baroda"));
        students.add(new Student(1, "Abcd", "Ahmedabad"));
        students.add(new Student(2, "Bbcd", "Baroda"));
        students.add(new Student(1, "Abcd", "Ahmedabad"));
        students.add(new Student(2, "Bbcd", "Baroda"));
        students.add(new Student(3, "Cbcd", "Chennai"));

        String namefile="C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\objectCompressorStudent_2.gz";
        System.out.println(students.toString());
        compressObjectsToFile(namefile, students);


    }
}
