package OOPs_Concepts;

class Person {
    String name;
    int age;

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
