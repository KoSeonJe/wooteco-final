package oncall;

import java.util.List;
import oncall.domain.HoliWorker;
import oncall.domain.WeekWorker;
import oncall.view.ApplicationView;
import oncall.service.WorkService;
import oncall.vo.WorkingDayInfo;

public class WorkScheduler {

    private final ApplicationView applicationView;
    private final WorkService workService;

    public WorkScheduler(ApplicationView applicationView, WorkService workService) {
        this.applicationView = applicationView;
        this.workService = workService;
    }

    public void execute() {
        WorkingDayInfo workingDayInfo = applicationView.inputWorkingDayInfo();

        requireWorker();

        scheduling(workingDayInfo);
    }

    private void requireWorker() {
        List<WeekWorker> weekWorkers = applicationView.requireWeekWorker();
        List<HoliWorker> holiWorkers = applicationView.requireHoliWorker();
        workService.saveWeekWorkers(weekWorkers);
        workService.saveHoliWorkers(holiWorkers);
    }

    private void scheduling(WorkingDayInfo workingDayInfo) {
        workService.createWorkSchedule(workingDayInfo);
    }
}
