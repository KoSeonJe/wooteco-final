package oncall;

public class Application {
    public static void main(String[] args) {
        ScheduleConfig scheduleConfig = new ScheduleConfig();
        WorkScheduler workScheduler = scheduleConfig.workScheduler();
        workScheduler.execute();
    }
}
