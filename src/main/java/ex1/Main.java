package ex1;

public class Main {
    public static enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void checkDay(Day day) {
        switch (day) {
            case SATURDAY, SUNDAY -> System.out.println(day + " is weekend");
            default -> System.out.println(day + " is a working day");
        }
    }

    public static void main(String[] args) {
        checkDay(Day.MONDAY);
        checkDay(Day.SATURDAY);
    }

}
