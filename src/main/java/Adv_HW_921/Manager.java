package Adv_HW_921;

public final class Manager extends BaseManager{

    private static final int MANAGER_INDEX = 3;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    @Override
    public double getSalary() {
        double salary;
        if (getNumberOfSubordinates()> 0){
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * MANAGER_INDEX);
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }
}
