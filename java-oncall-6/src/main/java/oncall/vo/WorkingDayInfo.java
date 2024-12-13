package oncall.vo;

public class WorkingDayInfo {

    int month;
    String dayOfWeek;

    public WorkingDayInfo(int month, String dayOfWeek) {
        this.month = month;
        this.dayOfWeek = dayOfWeek;
    }

    public int getMonth() {
        return month;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }
}
