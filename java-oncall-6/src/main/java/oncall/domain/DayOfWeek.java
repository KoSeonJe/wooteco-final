package oncall.domain;

import java.util.Objects;

public enum DayOfWeek {
    MONDAY("월",0),
    TUESDAY("화",1),
    WEDNESDAY("수",2),
    THURSDAY("목",3),
    FRIDAY("금",4),
    SATURDAY("토",5),
    SUNDAY("일",6);

    private String description;
    private int number;

    DayOfWeek(String description, int number) {
        this.description = description;
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }

    public static DayOfWeek findByDescription(String description) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (Objects.equals(dayOfWeek.getDescription(), description)) {
                return dayOfWeek;
            }
        }
        return null;
    }

    public static DayOfWeek findByNumber(int next) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.getNumber() == next) {
                return dayOfWeek;
            }
        }
        return null;
    }

    public static boolean isWeekend(DayOfWeek dayOfWeek) {
        return dayOfWeek == SATURDAY || dayOfWeek == SUNDAY;
    }

    public static boolean isExist(String description) {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (Objects.equals(dayOfWeek.getDescription(), description)) {
                return true;
            }
        }
        return false;
    }
}
