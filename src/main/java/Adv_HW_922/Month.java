package Adv_HW_922;

public final class Month {
    private String monthName;
    private int monthDays;
    private int monthWorkDays;

    public String getMonthName() {
        return monthName;
    }

    public int getMonthDays() {
        return monthDays;
    }

    public int getMonthWorkDays() {
        return monthWorkDays;
    }

    public Month(String monthName, int monthDays, int monthWorkDays) {
        this.monthName = monthName;
        this.monthDays = monthDays;
        this.monthWorkDays = monthWorkDays;

    }
}
