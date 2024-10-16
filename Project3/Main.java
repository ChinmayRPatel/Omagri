package Project3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws MyCustomException {

//                Set<Student> studentSet  = new HashSet<>();
                List<Student> studentSet  = new ArrayList<>();
                studentSet.add(new Student(1, "Alok", 1));
                studentSet.add(new Student(2, "Mahi", 5));
                studentSet.add(new Student(3, "Jimmy", 3));
                studentSet.add(new Student(4, "Rohit", 2));
                studentSet.add(new Student(6, "Jignesh", 11));
                studentSet.add(new Student(5, "Jignesh", 11));

                List<Address> studentAddress = new ArrayList<>();
//                Set<Address> studentAddress = new LinkedHashSet<>();
                studentAddress.add(new Address(1, "Ahmedabad", "Gj"));
                studentAddress.add(new Address(6, "Dic", "Gj"));
                studentAddress.add(new Address(2, "Udaipur", "Rj"));
                studentAddress.add(new Address(5, "Mumbai", "Mh"));
                studentAddress.add(new Address(7, "Mumbai", "Mh"));


                System.out.println("Availbale students are :- \n"+ studentSet);
                System.out.println("Address Lists Are :- \n"+studentAddress);


                int studentIdToFetch = 1;

//        try {
                Student fetchedStudent = fetchStudentById(studentSet, studentIdToFetch);
                Address fetchedAddress = fetchAddressById(studentAddress, studentIdToFetch );

//            if(fetchedStudent==null){
//                throw new MyCustomException("Student Details Are Not Found By Mentioned Id "+studentIdToFetch);
//            } else if (studentAddress==null) {
//                throw new MyCustomException("Student Address Are Not Found By Mentioned Id "+ studentIdToFetch);
//            }

            System.out.println("Student Details :- " + fetchedStudent + " Address Of Student is :- "+fetchedAddress);
            if(fetchedStudent!= null && fetchedAddress!= null){
                System.out.println("Id "+studentIdToFetch+" Student Name = "+ fetchedStudent.getsName()+ " City ="+fetchedAddress.getCity()+" , "+fetchedAddress.getState());
            }
//            }catch (MyCustomException e){
//                System.out.println(e.getMessage());
//            }



//        ***** Code for Combining of Hash Map which key - sId and Values are Object type which have student and adddress details

        HashMap<Integer, Object[]> studentDetailsMap = new HashMap<>();
        System.out.println("********* Students Whose Have Addresses Are Mentioned Below *****");
        for (Student student : studentSet) {
            Address address = fetchAddressById(studentAddress, student.getsId());
            if (address != null) {
                Object[] stuAdd = new Object[2]; // Array to hold Student and Add
                stuAdd[0] = student;  // Storae Stude at index 0
                stuAdd[1] = address;  // Storae Addreass at index 1
                studentDetailsMap.put(student.getsId(), stuAdd); // Put the combination in the map
            }
        }

        studentDetailsMap.forEach((integer, objects) -> System.out.println(integer + " "+ (Student)objects[0] + " "+ (Address)objects[1]));

    }
    private static Student fetchStudentById(List<Student> studentSer, int id) {
        for (Student student : studentSer) {
                if (student.getsId() == id) {
                    return student;
                }
        }
            return null;
    }
    private static Address fetchAddressById(List<Address> addressSer, int id){
        for(Address add : addressSer){
            if(Integer.valueOf(add.getAddressId()).equals(id)){
                return add;
            }
        }
        return null;
    }
}
