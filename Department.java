package Revision;

import java.util.ArrayList;

public class Department {
    int dno;
    String dname;
    ArrayList<Employee> emplist;
    public Department(){

    }
    public Department(int dno, String dname) {
        this.dno = dno;
        emplist = new ArrayList<Employee>();
        this.dname = dname;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public void add_employee(Employee e){
        emplist.add(e);
    }
    public void remove_employee(int idx){
        emplist.remove(idx);
    }

    public int getemployeecount(){
        return emplist.size();
    }
    public void print_basic_data() {
        for (int i = 0; i < emplist.size(); i++) {
            System.out.println(emplist.get(i).getSsn() + "" + emplist.get(i).getName() + "" + emplist.get(i).getSex() + "");
        }
    }
    public void print_all_details(){
        for (int i=0;i<emplist.size();i++){
            if (emplist.get(i) instanceof SalariedEmployee)
                ((SalariedEmployee) emplist.get(i)).Displayalldetails();
            if (emplist.get(i) instanceof HourlyEmployee)
                ((HourlyEmployee) emplist.get(i)).Displayalldetails();
            if (emplist.get(i) instanceof CommissionEmployee)
                ((CommissionEmployee) emplist.get(i)).Displayalldetails();
            }
        }
    }