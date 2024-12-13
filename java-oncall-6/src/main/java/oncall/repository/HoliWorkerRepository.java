package oncall.repository;

import java.util.ArrayList;
import java.util.List;
import oncall.domain.HoliWorker;

public class HoliWorkerRepository {

    private static final HoliWorkerRepository INSTANCE = new HoliWorkerRepository();

    private final List<HoliWorker> holiWorkers = new ArrayList<>();

    private HoliWorkerRepository() {
    }

    public static HoliWorkerRepository getInstance() {
        return INSTANCE;
    }

    public void saveAll(List<HoliWorker> inputWeekWorkers) {
        holiWorkers.addAll(inputWeekWorkers);
    }
}
