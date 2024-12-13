package oncall;

import java.util.ArrayList;
import java.util.List;

public class WorkRepository {

    private static final WorkRepository INSTANCE = new WorkRepository();

    private final List<Work> works = new ArrayList<>();

    private WorkRepository() {
    }

    public static WorkRepository getInstance() {
        return INSTANCE;
    }
}
