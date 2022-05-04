package Adv_HW_922;

import static Adv_HW_922.MonthUtils.getYear;

public class Main {
    public static void main(String[] args) {
        Employee baseEmployee1 = new Employee("Sergey", 30, 'M', 1000);
        Manager employee2 = new Manager("Anna", 28, 'F', 1000, 5);

        System.out.println(baseEmployee1.getSalary(getYear()));
        System.out.println(employee2.getSalary(getYear()));
    }
}
