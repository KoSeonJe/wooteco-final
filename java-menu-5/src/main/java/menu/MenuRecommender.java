package menu;

import java.util.List;

public class MenuRecommender {

    private final ApplicationView applicationView;
    private final CoachService coachService;

    public MenuRecommender(ApplicationView applicationView) {
        this.applicationView = applicationView;
    }

    public void recommend() {
        applicationView.introduce();

        requestCoach();
    }

    private void requestCoach() {
        List<String> coachNames = applicationView.inputCoach();
        coachService.createByNames(coachNames);

    }
}
