package Revision;

public class HourlyEmployee extends Employee implements Displayable {
    private double hour_rate;
    private int no_of_hours;

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }
    @Override
    public double earning(){
        return no_of_hours * hour_rate;
    }

    public HourlyEmployee(String ziad, Gender sex, int i, String rIyadh, int i1) {

    }

    public HourlyEmployee(String name, Gender sex, int ssn, String address, double hour_rate, int no_of_hours) {
        super(name, sex, ssn, address);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hour_rate=" + hour_rate +
                ", no_of_hours=" + no_of_hours +
                '}';
    }
    public void Displayalldetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    public void Displayearnings(){
        System.out.println(earning());
    }
}
