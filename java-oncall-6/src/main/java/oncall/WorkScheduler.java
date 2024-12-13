package oncall;

import java.util.List;

public class WorkScheduler {

    private final ApplicationView applicationView;
    private final WorkService workService;

    public WorkScheduler(ApplicationView applicationView, WorkService workService) {
        this.applicationView = applicationView;
        this.workService = workService;
    }

    public void execute() {
        List<String> workingDayInfo = applicationView.inputWorkingDayInfo();

        requireWorker();
    }

    private void requireWorker() {
        List<WeekWorker> weekWorkers = applicationView.requireWeekWorker();
        List<HoliWorker> holiWorkers = applicationView.requireHoliWorker();
        workService.saveWeekWorkers(weekWorkers);
        workService.saveHoliWorkers(holiWorkers);
    }
}
