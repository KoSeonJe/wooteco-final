package oncall;

import java.util.ArrayList;
import java.util.List;

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
}
