package FileSerialization.object;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;


    int id;
    String pName;
    int age;
//    transient String pwd;
//    In above password will not a take a part in serialize object in file IO and it will return the null when you try to call it

    public Person(int id, String pName, int age) {
        this.id = id;
        this.pName = pName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", age=" + age +
                '}';
    }

}
