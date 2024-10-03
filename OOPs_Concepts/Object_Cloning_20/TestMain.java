package OOPs_Concepts.Object_Cloning_20;

public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student obj1 = new Student();
        obj1.sid=11;
        Address address = new Address();
        address.addressId=1;

        obj1.address = address;

        Student obj2  = (Student) (obj1).clone();
        obj2.sid=22;
        obj2.address.addressId=2;

        obj1.address = address;

        System.out.println(obj1.sid);
        System.out.println(obj1.address.addressId);
        System.out.println(obj2.sid);
        System.out.println(obj2.address.addressId);
    }
}
