package Adv_HW_921;

public abstract class BaseManager extends Worker{

    private int numberOfSubordinates;
    protected abstract int getIndex();

    public BaseManager(double baseSalary, String name, int numberOfSubordinates) {
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
        if (getNumberOfSubordinates()> 0){
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * getIndex());
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }

}
