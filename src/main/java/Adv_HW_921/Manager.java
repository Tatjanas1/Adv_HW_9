package Adv_HW_921;

public final class Manager extends BaseManager{

    private static final int MANAGER_INDEX = 3;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }
    @Override
    protected int getIndex() {
        return MANAGER_INDEX;
    }
}
