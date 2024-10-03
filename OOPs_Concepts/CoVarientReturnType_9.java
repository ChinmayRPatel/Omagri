package OOPs_Concepts;

class Animal{
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal getAnimal(){
        System.out.println("Returning and Animal");
        return new Animal(name, age);
    }
    public void displayDetails(){
        System.out.println("Animal Name = "+name+"  Age =  "+age);
    }
}
class Dog extends Animal{
    String sound;
    public Dog(String name, int age, String sound){
        super(name, age);
        this.sound = sound;
    }

    @Override
    public Dog getAnimal(){
        System.out.println("Returning a dog");
        return new Dog(name, age, sound);
    }
    @Override
    public void displayDetails(){
        System.out.println(" Name = "+name+"  Age = "+age+" Sound = "+sound);
    }

}
public class CoVarientReturnType_9 {
    public static void main(String[] args) {
        Animal a = new Animal("Ronny", 5);
        a.displayDetails();
        Dog d = new Dog("John", 10, "Bhau Bhau");
        d.displayDetails();

        Animal returnedAnimal = a.getAnimal();  // Returns an Animal
        returnedAnimal.displayDetails();

        Dog returnedDog = d.getAnimal();  // Returns a Dog (covariant return type)
        returnedDog.displayDetails();
    }

}
