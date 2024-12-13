package oncall;

public class WeekWorker {

    private String name;
    private int workCount;

    private WeekWorker(String name) {
        this.name = name;
        this.workCount = 0;
    }

    public static WeekWorker create(String name) {
        return new WeekWorker(name);
    }
}
