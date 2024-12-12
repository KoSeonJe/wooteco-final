package menu.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import menu.domain.Coach;

public class CoachRepository {

    private static final CoachRepository INSTANCE = new CoachRepository();

    private final List<Coach> repository = new ArrayList<>();

    private CoachRepository() {

    }

    public static CoachRepository getInstance() {
        return INSTANCE;
    }

    public void save(Coach coach) {
        repository.add(coach);
    }

    public void saveAll(List<Coach> coaches) {
        repository.addAll(coaches);
    }

    public List<Coach> getAll() {
        return new ArrayList<>(repository);
    }

    public Coach findByName(String coachName) {
        return repository.stream()
            .filter(coach -> Objects.equals(coach.getName(), coachName))
            .findFirst()
            .orElse(null);
    }
}
