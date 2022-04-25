package Adv_HW_92;

public class Manager extends Employee{
    private int numberOfSubordinates;
    private final int managerIndex = 3;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        double salary;
        if (numberOfSubordinates > 0){
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * managerIndex);
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }
}
