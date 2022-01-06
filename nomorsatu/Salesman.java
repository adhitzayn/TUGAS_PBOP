package nomorsatu;

/**
 *
 * @author HP
 */
public class Salesman extends Employee{
    private double salary;
    private double netSalary;

    private double getSalary(double percentage) {
        double pfamount=salary*percentage;
        netSalary=salary-pfamount;
        return netSalary;
    }
}
