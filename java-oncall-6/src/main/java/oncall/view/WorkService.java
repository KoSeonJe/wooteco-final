package oncall.view;

import java.util.List;
import oncall.domain.HoliWorker;
import oncall.domain.WeekWorker;
import oncall.repository.HoliWorkerRepository;
import oncall.repository.WeekWorkerRepository;
import oncall.repository.WorkRepository;

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
