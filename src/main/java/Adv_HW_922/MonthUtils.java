package Adv_HW_922;

public class MonthUtils {
    public final static Month[] MONTH =
            { new Month("January", 31, 21),
                    new Month("February", 28,20),
                    new Month("March", 31,23),
                    new Month("April", 30, 21),
                    new Month("May", 31, 22),
                    new Month("June", 30,22),
                    new Month("July", 31,21),
                    new Month("August", 31,23),
                    new Month("September", 30,22),
                    new Month("October", 31, 21),
                    new Month("November", 30,22),
                    new Month("December", 31,22)
            };
    public final static Month[] WINTER =
            {new Month("December", 31,22),
                    new Month("January", 31, 21),
                    new Month("February", 28,20)
            };
    public final static Month[] SPRING =
            {
                    new Month("March", 31,23),
                    new Month("April", 30, 21),
                    new Month("May", 31, 22)
            };
    public final static Month[] SUMMER =
            {
                    new Month("June", 30,22),
                    new Month("July", 31,21),
                    new Month("August", 31,23)
            };
    public final static Month[] AUTUMN =
            {
                    new Month("September", 30,22),
                    new Month("October", 31, 21),
                    new Month("November", 30,22)
            };
    public final static Month[] FIRST_HALF =
            {
                    new Month("January", 31, 21),
                    new Month("February", 28,20),
                    new Month("March", 31,23),
                    new Month("April", 30, 21),
                    new Month("May", 31, 22),
                    new Month("June", 30,22)
            };
    public final static Month[] SECOND_HALF =
            {
                    new Month("July", 31,21),
                    new Month("August", 31,23),
                    new Month("September", 30,22),
                    new Month("October", 31, 21),
                    new Month("November", 30,22),
                    new Month("December", 31,22)
            };
}
