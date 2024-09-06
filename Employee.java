package Revision;

enum Gender{Male,Female};
public abstract class Employee {
    String name;
    String address;
    int ssn;
    Gender sex;

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

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Employee() {
    }

    public Employee(String name,Gender sex, int ssn, String address) {
        this.name = name;
        this.sex = sex;
        this.ssn = ssn;
        this.address = address;
    }
    public abstract double earning();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", sex=" + sex +
                '}';
    }
}
