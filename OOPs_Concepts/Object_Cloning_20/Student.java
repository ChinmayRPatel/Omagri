package OOPs_Concepts.Object_Cloning_20;

public class Student implements Cloneable {
    int sid;
    Address address;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
//        student.address=(Address) address.clone();
        return student;
    }
}
