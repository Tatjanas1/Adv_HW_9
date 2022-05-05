package Adv_HW_922;

public final class Manager extends BaseEmployee {

    private int subOrdination;

    public int getSubOrdination() {
        return subOrdination;
    }
    public void setSubOrdination(int subOrdination) {
        this.subOrdination = subOrdination;
    }

    public Manager(String name, int age, char gender, double daySalary, int subOrdination) {
        super(name, age, gender, daySalary);
        this.subOrdination = subOrdination;
    }

    @Override
    public double getSalary(Month[] monthArray){
        if (subOrdination > 0) {
            return super.getSalary(monthArray) + (subOrdination /100 * super.getSalary(monthArray));
        } else {
            return super.getSalary(monthArray);
        }


    }

}
