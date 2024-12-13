package oncall.common;

import oncall.WorkScheduler;
import oncall.repository.HoliWorkerRepository;
import oncall.repository.WeekWorkerRepository;
import oncall.repository.WorkRepository;
import oncall.view.ApplicationView;
import oncall.view.InputView;
import oncall.view.OutputView;
import oncall.service.WorkService;

public class ScheduleConfig {

    public WorkScheduler workScheduler() {
        return new WorkScheduler(applicationView(), workService());
    }

    private ApplicationView applicationView() {
        return new ApplicationView(new InputView(), new OutputView(), new WorkerMapper());
    }

    private WorkService workService() {
        return new WorkService(workRepository(), weekWorkerRepository(), holiWorkerRepository());
    }

    private WorkRepository workRepository() {
        return WorkRepository.getInstance();
    }

    private WeekWorkerRepository weekWorkerRepository() {
        return WeekWorkerRepository.getInstance();
    }

    private HoliWorkerRepository holiWorkerRepository() {
        return HoliWorkerRepository.getInstance();
    }
}
