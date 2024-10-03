package exceptions;

public class NestedTryCatch_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                int[] arr = new int[3];
                arr[5] = 10;  // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Inner catch block for ArrayIndexOutOfBoundsException."+e.getMessage());
            }catch (Exception e){
                System.out.println("Exceptions i occured"+e.getMessage());
            }
            finally {
                System.out.println("Finally of nner class");
            }

            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Outer catch block for ArithmeticException."+e.getMessage());
        }catch (Exception e){
            System.out.println("Exceptions i occured"+e.getMessage());
        }
        finally {
            System.out.println("Finally of outer");
        }
    }
}

