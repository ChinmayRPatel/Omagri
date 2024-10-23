package Generics.GenericInterface;

public class GenericContainer<T> implements  Container<T> {

    private T item;

    @Override
    public void add(T item) {
        item = this.item;
    }

    @Override
    public T get() {
        return item;
    }
}
