package Exercices_OOP._9_Enum.teory;

public enum _1_DaysWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;

    public static void main(String[] args){
        _1_DaysWeek today = _1_DaysWeek.SUNDAY;
        if (today == _1_DaysWeek.SUNDAY) System.out.println("Good week!");
        switch (today) {
            case SUNDAY:
                System.out.println("Good week!");
                break;
            case FRIDAY:
                System.out.println("Good weekend!");
                break;
            default:
                System.out.println("Good day!");
        }
        _1_DaysWeek[] days = _1_DaysWeek.values();
        for(int i = 0; i< days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
