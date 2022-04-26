package Adv_HW_922;

public final class Manager extends BaseEmployee {
    public int getSubOrdination() {
        return subOrdination;
    }

    public void setSubOrdination(int subOrdination) {
        this.subOrdination = subOrdination;
    }

    private int subOrdination;

    public Manager(String name, int age, char gender, double daySalary, int subOrdination) {
        super(name, age, gender, daySalary);
        this.subOrdination = subOrdination;
    }

    @Override
    public double getSalary(Month[] monthArray){
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++){
            salary += getDaySalary() * 0.1 / 100 * getSubOrdination() * monthArray[i].getMonthWorkDays();
        }
        return salary + super.getSalary(monthArray);
    }

}
