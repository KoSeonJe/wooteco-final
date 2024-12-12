package menu;

import menu.config.MenuRecommenderConfig;

public class Application {
    public static void main(String[] args) {
        MenuRecommenderConfig config = new MenuRecommenderConfig();
        MenuRecommender recommender = config.menuRecommender();
        recommender.execute();
    }
}
