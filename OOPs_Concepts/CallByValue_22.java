package OOPs_Concepts;

public class CallByValue_22 {

    public  void change(int num){
        num = num +10;
        System.out.println("Number is changed :- num+10 = "+ num);
    }

    public static void main(String[] args) {
        int n=100;
        System.out.println("Without change n = "+n);
        CallByValue_22 obj = new CallByValue_22();
        obj.change(n);
        System.out.println("After  change n = "+n);
    }

}
