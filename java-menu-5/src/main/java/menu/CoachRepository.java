package menu;

import java.util.ArrayList;
import java.util.List;

public class CoachRepository {

    private static final CoachRepository INSTANCE = new CoachRepository();

    private final List<Coach> repository = new ArrayList<>();

    private CoachRepository() {

    }

    public CoachRepository getInstance() {
        return INSTANCE;
    }

    public void save(Coach coach) {
        repository.add(coach);
    }

    public void saveAll(List<Coach> coaches) {
        repository.addAll(coaches);
    }
}
