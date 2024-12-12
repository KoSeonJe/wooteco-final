package menu.config;

import menu.MenuRecommender;
import menu.repository.CoachRepository;
import menu.service.CoachService;
import menu.view.ApplicationView;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuRecommenderConfig {

    public MenuRecommender menuRecommender() {
        return new MenuRecommender(applicationView(), coachService());
    }

    private ApplicationView applicationView() {
        return new ApplicationView(new InputView(), new OutputView());
    }

    private CoachService coachService() {
        return new CoachService(coachRepository());
    }

    private CoachRepository coachRepository() {
        return CoachRepository.getInstance();
    }
}
