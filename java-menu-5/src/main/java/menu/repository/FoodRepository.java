package menu.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import menu.common.DataInitializer;

public class FoodRepository {

    private static final FoodRepository INSTANCE = new FoodRepository();

    private final Map<String, List<String>> repository = new HashMap<>(DataInitializer.initFood());
    private final List<String> categories = new ArrayList<>(DataInitializer.initCategory());

    private FoodRepository() {

    }

    public static FoodRepository getInstance() {
        return INSTANCE;
    }

    public List<String> getAllCategories() {
        return new ArrayList<>(categories);
    }

    public List<String> getMenusByCategory(String recommendCategory) {
        return repository.get(recommendCategory);
    }
}
