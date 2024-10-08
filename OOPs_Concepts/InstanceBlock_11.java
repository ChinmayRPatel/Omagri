package OOPs_Concepts;

class Person {
    String name;
    int age;
//    Instance blocks are executed whenever an object of any kind is created.
//    If we want to write a logic that we want to execute on the creation of all kinds of objects,
//    then using instance blocks is a good idea to avoid writing the same logic inside every constructor.

//    Its will call before the constructor
//    Every time when constructor is create then onstance block can modify the user illegal argument and make it easy t handle the some erro in that


    {
        System.out.println("Instance block: Validating default values");
        if (age < 0) {
            age = 0;
        }
        if(name == null){
            name = "No name";
        }
    }

    public Person() {
        System.out.println("No-argument constructor called");
    }

    public Person(String name, int age) {
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class InstanceBlock_11 {
    public static void main(String[] args) {
        Person p = new Person();
        p.displayDetails();
        Person p2 = new Person("Mehul", 12);
        p2.displayDetails();
    }
}
