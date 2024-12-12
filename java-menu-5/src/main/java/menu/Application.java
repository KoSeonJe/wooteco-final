package menu;

public class Application {
    public static void main(String[] args) {
        MenuRecommenderConfig config = new MenuRecommenderConfig();
        MenuRecommender recommender = config.menuRecommender();
        recommender.recommend();
    }
}
