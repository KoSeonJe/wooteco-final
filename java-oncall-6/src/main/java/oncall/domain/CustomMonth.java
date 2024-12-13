package oncall.domain;

import java.util.List;

public class CustomMonth {

    private int month;
    private List<Integer> holidays;
    private int lastDay;

    private CustomMonth(int month, List<Integer> holidays, int lastDay) {
        this.month = month;
        this.holidays = holidays;
        this.lastDay = lastDay;
    }

    public static CustomMonth create(int month, List<Integer> holidays, int lastDay) {
        return new CustomMonth(month, holidays, lastDay);
    }
}
