package oncall;

import java.util.List;

public class WorkService {

    private final WorkRepository workRepository;
    private final WeekWorkerRepository weekWorkerRepository;
    private final HoliWorkerRepository holiWorkerRepository;

    public WorkService(WorkRepository workRepository, WeekWorkerRepository weekWorkerRepository,
        HoliWorkerRepository holiWorkerRepository) {
        this.workRepository = workRepository;
        this.weekWorkerRepository = weekWorkerRepository;
        this.holiWorkerRepository = holiWorkerRepository;
    }

    public void saveWeekWorkers(List<WeekWorker> weekWorkers) {
        weekWorkerRepository.saveAll(weekWorkers);
    }

    public void saveHoliWorkers(List<HoliWorker> holiWorkers) {
    }
}
