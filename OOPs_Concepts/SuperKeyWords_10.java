package OOPs_Concepts;

class Vehicle{
    int year=2020;
    public Vehicle(int year){
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("The Vehicle is constructed on year = "+ this.year);
    }
}
class Car1 extends  Vehicle{
    String model="Default model";
    public Car1(String model, int year){
        super(year);
        this.model = model;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();  // Calling the parent class method
        System.out.println("Car Model: " + model);  // Adding model-specific details
    }
    public void displayParentClass(){
        int a = super.year;
        System.out.println("Child class (Parent's class year is ) "+a);
        super.displayInfo();
    }

}
class SuperKeyWords_10 {
    public static void main(String[] args) {
        Car1 c = new Car1("Mahindra XUV 700", 2022);
        c.displayInfo();
        c.displayParentClass();
        c.displayInfo();


    }

}
