package oncall;

import oncall.common.ScheduleConfig;

public class Application {
    public static void main(String[] args) {
        ScheduleConfig scheduleConfig = new ScheduleConfig();
        WorkScheduler workScheduler = scheduleConfig.workScheduler();
        workScheduler.execute();
    }
}
