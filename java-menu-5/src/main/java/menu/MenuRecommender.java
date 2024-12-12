package menu;

import java.util.List;
import menu.service.CoachService;
import menu.service.RecommendService;
import menu.view.ApplicationView;

public class MenuRecommender {

    private final ApplicationView applicationView;
    private final CoachService coachService;
    private final RecommendService recommendService;

    public MenuRecommender(ApplicationView applicationView, CoachService coachService,
        RecommendService recommendService) {
        this.applicationView = applicationView;
        this.coachService = coachService;
        this.recommendService = recommendService;
    }

    public void execute() {
        applicationView.introduce();

        requestCoach();

        requestHateFood();

        recommend();
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

    private void recommend() {
        recommendService.recommend();
    }
}
