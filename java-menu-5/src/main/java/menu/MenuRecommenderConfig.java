package menu;

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
