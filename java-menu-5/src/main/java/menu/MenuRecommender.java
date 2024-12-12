package menu;

import java.util.List;

public class MenuRecommender {

    private final ApplicationView applicationView;
    private final CoachService coachService;

    public MenuRecommender(ApplicationView applicationView, CoachService coachService) {
        this.applicationView = applicationView;
        this.coachService = coachService;
    }

    public void recommend() {
        applicationView.introduce();

        requestCoach();

        requestHateFood();
    }

    private void requestCoach() {
        List<String> coachNames = applicationView.inputCoach();
        coachService.createByNames(coachNames);
    }

    private void requestHateFood() {
        List<String> coachNames = coachService.getAllNames();
        coachNames.forEach(coachName -> {
            List<String> hateFoods = applicationView.inputHateFoods(coachName);
            coachService.updateHateFoods(coachName, hateFoods);
        });
    }
}
