package OOPs_Concepts;

class Book{
    String name;
    String author;
    public Book(String s1, String s2){
        this.name = s1;
        this.author=s2;
    }
    public void display(){
        System.out.println("Book: " + this.name + ", Author: " + this.author);
    }
}
class Library {
    String name;
    Book book=new Book("Mahabharat", "Ved Vyas");  //Library  HAS_A Book
    public void display() {
        System.out.println("Library: " + name);
        book.display();
    }
}
public class Aggretation_Has_A_7 {
    public static void main(String[] args) {
        Library obj = new Library();
        obj.display();
    }
}
