package exceptions;

public class Throws_KeyWord {
    public static void main(String[] args) {
        try{
            Throws_KeyWord obj = new Throws_KeyWord();
            obj.divide(12,0);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Cant not divide by 0  zeor");
        }else{
            System.out.println("Result = "+a/b);
        }
    }
}
