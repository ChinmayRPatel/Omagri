package Generics;
interface Pritntale{
    void print();
}
class MyNumber extends Number implements Pritntale{

    public final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("Value = "+ value);

    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
class Boxx<T extends Number & Pritntale>{
    private T item;
    public  Boxx(T item){
        this.item = item;
    }
    public void dispay(){
        item.print();
    }
    public T getItem(){
        return  item;
    }


}
public class BoundedTypeParametersExample<T extends Number> {
    public static void main(String[] args) {

        MyNumber mn  = new MyNumber(12);
        Boxx<MyNumber>  box = new Boxx<>(mn);

    }


}
