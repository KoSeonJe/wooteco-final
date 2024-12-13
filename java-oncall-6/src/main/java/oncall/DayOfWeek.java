package oncall;

import java.util.Objects;

public enum DayOfWeek {
    MONDAY("월"),
    TUESDAY("화"),
    WEDNESDAY("수"),
    THURSDAY("목"),
    FRIDAY("금"),
    SATURDAY("토"),
    SUNDAY("일");

    private String description;

    DayOfWeek(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
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
