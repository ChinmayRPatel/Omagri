package OOPs_Concepts;

public class Constructors_3 {
    int a;
    int b;
    public Constructors_3(int a, int b){
        System.out.println("User Defined Cunstructor is called and data set of a ="+a+" b= "+b);
    }

    public Constructors_3(){
        System.out.println("Default Constructor i called");
    }

    public static void main(String[] args) {
        Constructors_3 c = new Constructors_3();
        Constructors_3 c2 = new Constructors_3(11, 23);
    }


}

