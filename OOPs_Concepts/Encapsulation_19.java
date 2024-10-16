package OOPs_Concepts;

class Student{
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name= name;
    }
    public Student(){
        System.out.println("This is default constructor ");
    }
    public void setId(int id){
        this.id = id;

    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void display(){
        System.out.println("Id = "+ this.id+"  name =  "+ this.name);
    }
}
public class Encapsulation_19 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);

        s1.setName("Alok");
        System.out.println((s1.getId()));
        System.out.println((s1.getName()));
        s1.display();


        Student s2 = new Student(12,"Abhi");
//        s2.setId(12);
//        s2.setName("Mr Abhi");
//we can use both constructor
        System.out.println(s2.getId());
        System.out.println(s2.getName());

        s2.display();





    }
}
