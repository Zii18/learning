package Revision;

public class CommissionEmployee extends Employee implements Displayable {
    private double gross_sale;
    private double commission_rate;

    public double getGross_sale() {
        return gross_sale;
    }

    public void setGross_sale(double gross_sale) {
        this.gross_sale = gross_sale;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    public CommissionEmployee(String zii, Gender sex, int i, String riyah, int i1){}
    public CommissionEmployee(String name, Gender sex, int ssn, String address, double gross_sale, double commission_rate) {
        super(name, sex, ssn, address);
        this.gross_sale = gross_sale;
        this.commission_rate = commission_rate;
    }

    @Override
    public double earning(){
        return gross_sale * commission_rate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "gross_sale=" + gross_sale +
                ", commission_rate=" + commission_rate +
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
