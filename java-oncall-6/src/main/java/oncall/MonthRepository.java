package oncall;

import java.util.HashMap;
import java.util.Map;

public class MonthRepository {

    private static final MonthRepository INSTANCE = new MonthRepository();

    private final Map<Integer, CustomMonth> repository = new HashMap<>(DataInitializer.initMonth());

    private MonthRepository() {

    }

    public static MonthRepository getInstance() {
        return INSTANCE;
    }

}
