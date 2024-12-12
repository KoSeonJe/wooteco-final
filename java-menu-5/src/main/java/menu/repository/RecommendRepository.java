package menu.repository;

import java.util.ArrayList;
import java.util.List;
import menu.domain.Recommend;

public class RecommendRepository {

    private static final RecommendRepository INSTANCE = new RecommendRepository();

    private final List<Recommend> repository = new ArrayList<>();

    private RecommendRepository() {

    }

    public static RecommendRepository getInstance() {
        return INSTANCE;
    }

    public void add(Recommend recommend) {
        repository.add(recommend);
    }

    public List<Recommend> getAll() {
        return new ArrayList<>(repository);
    }
}
