package menu;

public class MenuRecommender {

    private final ApplicationView applicationView;

    public MenuRecommender(ApplicationView applicationView) {
        this.applicationView = applicationView;
    }

    public void recommend() {
        applicationView.introduce();

    }
}
