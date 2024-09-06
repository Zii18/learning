package Revision;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    double base;

    public BasePlusCommissionEmployee() {
        super("Zii", Gender.Male, 12, "Riyah", 1200);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double earning(){
        return base + super.earning();
    }
    @Override
    public void Displayalldetails(){
        super.Displayalldetails();
        Displayearnings();
    }
    public void Displayearnings(){
        System.out.println(" Earning = " + earning());
    }

}