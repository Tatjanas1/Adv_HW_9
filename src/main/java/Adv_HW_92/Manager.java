package Adv_HW_92;

public class Manager extends Employee{
    private int numberOfSubordinates;
    private final int MANAGER_INDEX = 3;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }



    @Override
    public double getSalary() {
        double salary;
        if (numberOfSubordinates > 0){
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * MANAGER_INDEX);
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }
}
