package oncall;

public class HoliWorker {

    private String name;
    private int workCount;

    private HoliWorker(String name) {
        this.name = name;
        this.workCount = 0;
    }

    public static HoliWorker create(String name) {
        return new HoliWorker(name);
    }
}
