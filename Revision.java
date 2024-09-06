package Revision;

public class Revision {
    public static void main(String[] args) {
Department d1= new Department(1,"IT");
SalariedEmployee se = new SalariedEmployee("Zozo",Gender.Female,1,"Cairo",23111,1222);
d1.add_employee(se);
HourlyEmployee he = new HourlyEmployee("Ziad",Gender.Male,1,"Riyadh",23.4,1);
d1.add_employee(he);
CommissionEmployee ce = new CommissionEmployee("Zii",Gender.Male,2,"Jeddah",3.2,0.2);
d1.add_employee(ce);
        System.out.println(d1.getemployeecount());
        d1.print_basic_data();
        d1.print_all_details();
    }
}
