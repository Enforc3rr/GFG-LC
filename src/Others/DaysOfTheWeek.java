package Others;

public enum DaysOfTheWeek {
    SUNDAY(60) ,
    MONDAY (20),
    SATURDAY (90);

    final int levelOfHappiness;

    DaysOfTheWeek(int levelOfHappiness){
        this.levelOfHappiness = levelOfHappiness;
    }
}
