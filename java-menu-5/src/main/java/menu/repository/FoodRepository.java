package menu.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import menu.common.DataInitializer;
import menu.domain.Coach;

public class FoodRepository {

    private static final FoodRepository INSTANCE = new FoodRepository();

    private final Map<String, List<String>> repository = new HashMap<>(DataInitializer.initFood());

    private FoodRepository() {

    }

    public static FoodRepository getInstance() {
        return INSTANCE;
    }
}
