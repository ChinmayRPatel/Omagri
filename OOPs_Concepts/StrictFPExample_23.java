package OOPs_Concepts;

public class StrictFPExample_23 {
    public static void main(String[] args) {
        System.out.println((add(1.2222, 2.1)));
        System.out.println((add(1.2220000, 2.1)));
        System.out.println((mul(1.2220000, 2.1)));
        System.out.println((mul(1.22200001, 2.1)));
    }
    static strictfp double add(double a, double b){
        return a+b;
    }
    static  strictfp double mul(double a, double b) {
        return a * b;
    }
}
