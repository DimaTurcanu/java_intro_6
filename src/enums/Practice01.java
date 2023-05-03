package enums;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {

        DaysOfTheWeek daysByUser = DaysOfTheWeek.valueOf(ScannerHelper.getString());

        switch (daysByUser){
            case SUNDAY:
            case SATURDAY:
                System.out.println("It is off day");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It is work day");
                break;
            default:
                throw new RuntimeException("No such enum value");
        }
    }
}
