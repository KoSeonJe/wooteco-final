package oncall.repository;

import java.util.ArrayList;
import java.util.List;
import oncall.domain.WeekWorker;

public class WeekWorkerRepository {

    private static final WeekWorkerRepository INSTANCE = new WeekWorkerRepository();

    private final List<WeekWorker> weekWorkers = new ArrayList<>();

    private WeekWorkerRepository() {
    }

    public static WeekWorkerRepository getInstance() {
        return INSTANCE;
    }

    public void saveAll(List<WeekWorker> inputWeekWorkers) {
        weekWorkers.addAll(inputWeekWorkers);
    }

    public List<WeekWorker> getAll() {
        return new ArrayList<>(weekWorkers);
    }
}
