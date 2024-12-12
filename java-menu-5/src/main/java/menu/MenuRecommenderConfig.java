package menu;

public class MenuRecommenderConfig {

    public MenuRecommender menuRecommender() {
        return new MenuRecommender(applicationView());
    }

    private ApplicationView applicationView() {
        return new ApplicationView(new InputView(), new OutputView());
    }
}
