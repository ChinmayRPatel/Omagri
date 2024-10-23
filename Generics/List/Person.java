package Generics.List;

public class Person {

    int pId;
    String pName;
    String pAddress;

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pAddress='" + pAddress + '\'' +
                '}'+"\n";
    }

    public Person(int pId, String pName, String pAddress) {
        this.pId = pId;
        this.pName = pName;
        this.pAddress = pAddress;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

}
