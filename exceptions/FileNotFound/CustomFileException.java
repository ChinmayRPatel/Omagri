package exceptions.FileNotFound;


import java.io.File;
import java.io.ObjectInput;

class CustomFileNotFoundExc extends  Exception{
     public CustomFileNotFoundExc(Throwable t){
         super(t);
     }

    public CustomFileNotFoundExc(String s) {
         super(s);
    }
}
public class CustomFileException {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Omagri\\CollectionPrograms\\Sorting\\Fruits.java");
            if(!f.exists()){
                throw  new CustomFileNotFoundExc("File not Exists and mentioned Path :- "+f);
            }else{
                System.out.println(f.exists());
            }
            System.out.println("Helloe");
            System.out.println(f.canRead());

        }catch (CustomFileNotFoundExc e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.getMessage();
        }
    }
}
