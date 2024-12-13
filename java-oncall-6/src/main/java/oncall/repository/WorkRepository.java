package oncall.repository;

import java.util.ArrayList;
import java.util.List;
import oncall.domain.Work;

public class WorkRepository {

    private static final WorkRepository INSTANCE = new WorkRepository();

    private final List<Work> repository = new ArrayList<>();

    private WorkRepository() {
    }

    public static WorkRepository getInstance() {
        return INSTANCE;
    }

    public void save(Work work) {
        repository.add(work);
    }

    public List<Work> getAll() {
        return new ArrayList<>(repository);
    }
}
