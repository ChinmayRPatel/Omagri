package CroneExample;

class Person implements Cloneable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

}
