package Adv_HW_922;

public class MonthUtils {
    private static final Month JAN = new Month("January", 31, 21);
    private static final Month FEB = new Month("February", 28,20);
    private static final Month MAR = new Month("March", 31,23);
    private static final Month APR = new Month("April", 30, 21);
    private static final Month MAY = new Month("May", 31, 22);
    private static final Month JUN = new Month("June", 30,22);
    private static final Month JUL = new Month("July", 31,21);
    private static final Month AUG = new Month("August", 31,23);
    private static final Month SEP = new Month("September", 30,22);
    private static final Month OCT = new Month("October", 31, 21);
    private static final Month NOV = new Month("November", 30,22);
    private static final Month DEC = new Month("December", 31,22);


    private static final Month[] YEAR = {JAN,FEB,MAR,APR,MAY,JUN, JUL, AUG,SEP,OCT,NOV,DEC };

    public static Month getMonth (int index){
        return YEAR[index];
    }

    public static int getMonthsSize(){
        return YEAR.length;
    }

    public static Month[] getYear(){return YEAR;}

    private final static Month[] WINTER = { JAN,DEC,FEB};
    private final static Month[] SPRING = { MAR,APR,MAY };
    private final static Month[] SUMMER = { JUN, JUL, AUG};
    private final static Month[] AUTUMN =  { SEP, OCT, NOV };
    private final static Month[] FIRST_HALF = {JAN,DEC,FEB, MAR,APR,MAY};
    private final static Month[] SECOND_HALF = {JUN, JUL, AUG, SEP, OCT, NOV};

    public static Month[] getWinter(){return WINTER;}
    public static Month[] getSpring(){return SPRING;}
    public static Month[] getSummer(){return SUMMER;}
    public static Month[] getAutumn(){return AUTUMN;}
    public static Month[] getFirstHalf(){return FIRST_HALF;}
    public static Month[] getSecondHalf(){return SECOND_HALF;}
}
