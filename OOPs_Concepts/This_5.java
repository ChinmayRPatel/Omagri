package OOPs_Concepts;

public class This_5 {
        int a;
        int b;
        String name;
        public This_5(int a, int b, String name){
            this.a = a ;
            this.b = b;
            this.name =name;
        }
        public void display(){
            System.out.println("a = "+this.a+"  b = "+this.b+" name  = " +this.name);
        }
    public static void main(String[] args) {
            This_5 obj = new This_5(11, 44, "Hey");
            obj.display();
    }
}
