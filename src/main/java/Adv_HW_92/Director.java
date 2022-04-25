package Adv_HW_92;

public class Director extends Manager{
    private final int directorIndex = 6;
    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }
    @Override
    public double getSalary() {
        double salary = 0;
        salary = getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 10.0 * directorIndex);
        return salary;
    }
}
