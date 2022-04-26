package Adv_HW_922;

import static Adv_HW_922.MonthUtils.MONTH;

public class Main {
    public static void main(String[] args) {
        Employee baseEmployee1 = new Employee("Sergey", 30, 'M', 1000);
        Manager employee2 = new Manager("Anna", 28, 'F', 1000, 5);

        Month[] month72 = {new Month("January", 31, 21),
                new Month("February", 28,20),
                new Month("March", 31,23)};

        System.out.println(baseEmployee1.getSalary(MONTH));
        System.out.println(employee2.getSalary(MONTH));
    }
}
