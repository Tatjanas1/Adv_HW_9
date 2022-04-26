package Adv_HW_921;

public class Director extends Employee {
    private final int DIRECTOR_INDEX = 9;
    private int numberOfSubordinates;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    public void setNumerOfSubordinates(){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        double salary = 0;
        salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * DIRECTOR_INDEX);
        return salary;
    }
}
