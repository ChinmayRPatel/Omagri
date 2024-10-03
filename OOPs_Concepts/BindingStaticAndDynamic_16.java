package OOPs_Concepts;

class Animal_16{
    static void sound(){
        System.out.println("This is the sound of animal");
    }
    void sound2(){
        System.out.println("This is sound 2 of animals");
    }
}
class Dog_16 extends  Animal_16{
    static void sound(){
        System.out.println("Dog is barking");
    }
    void sound2(){
        System.out.println("This i ssound 2 of dog");
    }
}
public class BindingStaticAndDynamic_16 {
    public static void main(String[] args) {
//        ere we have created the object of animal with ref of animal and we only get the method of animal
        Animal_16 obj = new Animal_16();
        obj.sound();
        obj.sound2();

        Dog_16 obj2 = new Dog_16();
        obj2.sound();
        obj2.sound2();

        Animal_16 obj3 = new Dog_16();
        obj3.sound();
        obj3.sound2();

//        Output of above is :-

//This is the sound of animal
//This is sound 2 of animals
//Dog is barking
//This i ssound 2 of dog
//This is the sound of animal
//This i ssound 2 of dog
    }
}
