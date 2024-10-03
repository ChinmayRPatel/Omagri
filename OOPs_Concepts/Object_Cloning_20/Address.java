package OOPs_Concepts.Object_Cloning_20;

public class Address implements Cloneable {
    int addressId;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
