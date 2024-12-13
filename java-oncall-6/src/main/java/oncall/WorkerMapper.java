package oncall;

import java.util.List;

public class WorkerMapper {

    private static final String WORKER_DELIMITER = ",";

    public List<WeekWorker> toWeekWorkers(String inputWorkers) {
        List<String> workerNames = List.of(inputWorkers.split(WORKER_DELIMITER));
        return workerNames.stream()
            .map(WeekWorker::create)
            .toList();
    }

    public List<HoliWorker> toHoliWorkers(String inputWorkers) {
        List<String> workerNames = List.of(inputWorkers.split(WORKER_DELIMITER));
        return workerNames.stream()
            .map(HoliWorker::create)
            .toList();
    }
}
