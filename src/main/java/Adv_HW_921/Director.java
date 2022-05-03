package Adv_HW_921;

public final class Director extends BaseManager {

    private static final int DIRECTOR_INDEX = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    @Override
    public double getSalary() {
        double salary = 0;
        if (getNumberOfSubordinates() > 0){
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * DIRECTOR_INDEX);
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }
}
