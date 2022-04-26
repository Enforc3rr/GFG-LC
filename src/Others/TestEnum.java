package Others;
/*
    Enums (short for Enumerations) are used in Java to hold types that have a certain finite set of values
 */
public class TestEnum {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.SATURDAY;
        if(day == DaysOfTheWeek.SATURDAY){
            System.out.println("It's Weekenddddddddd");
        }

        for(DaysOfTheWeek days : DaysOfTheWeek.values()){
            System.out.println(days);
        }
        System.out.println(DaysOfTheWeek.MONDAY.levelOfHappiness);
    }
}
