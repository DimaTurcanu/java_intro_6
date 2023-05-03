package enums;

public class Practice02 {
    public static void main(String[] args) {

        Frequency frequency = Frequency.DAILY;

        switch (frequency){
            case HOURLY:
                System.out.println("$20");break;
            case WEEKLY:
                System.out.println("$800");break;
            case DAILY:
                System.out.println("$160");break;
            case MONTHLY:
                System.out.println("$3200");break;
            case BI_WEEKLY:
                System.out.println("$1600");break;
            case YEARLY:
                System.out.println("$38400");break;
        }
    }
}
