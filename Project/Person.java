package Project;

import java.util.Objects;

public class Person implements Comparable<Person>{
        int pid;
        String name;
        String address;
        String mobileNumber;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}'+"\n";
    }


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public Person(int pid, String name, String address, String mobileNumber) {
        this.pid = pid;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }


    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.pid, that.pid);
    }
}
