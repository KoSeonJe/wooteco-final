package oncall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataInitializer {

    private final MonthRepository monthRepository;

    public DataInitializer(MonthRepository monthRepository) {
        this.monthRepository = monthRepository;
    }

    public static Map<Integer, CustomMonth> initMonth() {
        Map<Integer, CustomMonth> temp = new HashMap<>();
        temp.put(1, CustomMonth.create(1, List.of(1), 31));
        temp.put(2, CustomMonth.create(1, null, 30));
        temp.put(3, CustomMonth.create(1, List.of(1), 31));
        temp.put(4, CustomMonth.create(1, null, 30));
        temp.put(5, CustomMonth.create(1, List.of(5), 31));
        temp.put(6, CustomMonth.create(1, List.of(6), 30));
        temp.put(7, CustomMonth.create(1, null, 31));
        temp.put(8, CustomMonth.create(1, List.of(15), 31));
        temp.put(9, CustomMonth.create(1, null, 30));
        temp.put(10, CustomMonth.create(1, List.of(3,9), 31));
        temp.put(11, CustomMonth.create(1, null, 30));
        temp.put(12, CustomMonth.create(1, List.of(25), 31));
        return temp;
    }
}
