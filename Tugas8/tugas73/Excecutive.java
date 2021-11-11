package tugas73;

public class Excecutive extends Employee{
    private double bonus;
    
    public Excecutive (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        
        bonus = 0;
    }
    
    public void awardBonus (double execBonus)
    {
        bonus = execBonus;
    }
    
    @Override
    public double pay()
    {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}
