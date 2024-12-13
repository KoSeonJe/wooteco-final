package oncall.domain;

public class Work {

    private CustomMonth customMonth;
    private DayOfWeek dayOfWeek;
    private String worker;

    public Work(CustomMonth customMonth, DayOfWeek dayOfWeek, String worker) {
        this.customMonth = customMonth;
        this.dayOfWeek = dayOfWeek;
        this.worker = worker;
    }

    public CustomMonth getCustomMonth() {
        return customMonth;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public String getWorker() {
        return worker;
    }
}
