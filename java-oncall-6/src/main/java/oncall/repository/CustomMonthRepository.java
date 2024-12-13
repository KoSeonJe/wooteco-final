package oncall.repository;

import java.util.HashMap;
import java.util.Map;
import oncall.common.DataInitializer;
import oncall.domain.CustomMonth;

public class CustomMonthRepository {

    private static final CustomMonthRepository INSTANCE = new CustomMonthRepository();

    private final Map<Integer, CustomMonth> repository = new HashMap<>(DataInitializer.initMonth());

    private CustomMonthRepository() {

    }

    public static CustomMonthRepository getInstance() {
        return INSTANCE;
    }

    public CustomMonth findByMonth(int month) {
        return repository.get(month);
    }
}
