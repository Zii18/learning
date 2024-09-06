package Revision;

public class SalariedEmployee extends Employee implements Displayable {
    double salary, bonus , deduction;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public SalariedEmployee(String name,Gender sex, int ssn, String address, double salary, double bonus) {
        super(name, sex, ssn, address);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public SalariedEmployee() {
    }
    @Override
    public double earning(){
       return  (salary + bonus) - deduction;
    }
    public void Displayalldetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    public void Displayearnings(){
        System.out.println(earning());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", deduction=" + deduction +
                '}';
    }
}
