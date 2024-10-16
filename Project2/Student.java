package Project2;

public class Student {
    int sId;
    String studentName;
    int studentSTD;
    Address address;


    public Student(int sId, String studentName, int studentSTD, Address address) {
        this.sId = sId;
        this.studentName = studentName;
        this.studentSTD = studentSTD;
        this.address = address;
    }


    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentSTD() {
        return studentSTD;
    }

    public void setStudentSTD(int studentSTD) {
        this.studentSTD = studentSTD;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", studentName='" + studentName + '\'' +
                ", studentSTD='" + studentSTD + '\'' +
                ", address=" + address +
                '}';
    }

}
