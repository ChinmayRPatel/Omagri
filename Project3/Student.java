package Project3;

import java.util.Objects;

public class Student {
    int sId;
    String sName;
    int sSTD;

//    Getter- setter- constructor- toString- hashCode


    public Student(int sId, String sName, int sSTD) {
        this.sId = sId;
        this.sName = sName;
        this.sSTD = sSTD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sId == student.sId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sId);
    }


    @Override
    public String toString() {
        return "Student{ " +
                " sId= " + sId +
                ", sName= '" + sName + '\'' +
                ", sSTD= " + sSTD +
                '}'+"\n";
    }


    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsSTD() {
        return sSTD;
    }

    public void setsSTD(int sSTD) {
        this.sSTD = sSTD;
    }
}
