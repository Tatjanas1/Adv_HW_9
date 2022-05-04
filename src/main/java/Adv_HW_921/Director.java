package Adv_HW_921;

public final class Director extends BaseManager {

    private static final int DIRECTOR_INDEX = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return DIRECTOR_INDEX;
    }
}
