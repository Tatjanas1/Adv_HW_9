package Adv_HW_922;

public final class Month {
    private final String monthName;
    private final int monthDays;
    private final int monthWorkDays;

    public Month(String monthName, int monthDays, int monthWorkDays) {
        this.monthName = monthName;
        this.monthDays = monthDays;
        this.monthWorkDays = monthWorkDays;

    }

    public String getMonthName() {
        return monthName;
    }

    public int getMonthDays() {
        return monthDays;
    }

    public int getMonthWorkDays() {
        return monthWorkDays;
    }
}
