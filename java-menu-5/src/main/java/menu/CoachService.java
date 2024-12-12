package menu;

import java.util.List;
import java.util.stream.Collectors;

public class CoachService {

    private final CoachRepository coachRepository;

    public CoachService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    public void createByNames(List<String> coachNames) {
        List<Coach> coaches = coachNames.stream()
            .map(Coach::create)
            .collect(Collectors.toList());
        coachRepository.saveAll(coaches);
    }

    public List<String> getAllNames() {
        List<Coach> coaches = coachRepository.getAll();
        return coaches.stream()
            .map(Coach::getName)
            .collect(Collectors.toList());
    }
}
