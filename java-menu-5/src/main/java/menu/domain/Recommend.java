package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Recommend {

    private String coachName;
    private List<String> categories;
    private List<String> menus;

    private Recommend(String coachName, List<String> categories) {
        this.coachName = coachName;
        this.categories = categories;
        this.menus = new ArrayList<>();
    }

    public String getCoachName() {
        return coachName;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getMenus() {
        return menus;
    }

    public static Recommend create(String coachName, List<String> categories) {
        return new Recommend(coachName, categories);
    }

    public void addFood(String recommendFood) {
        menus.add(recommendFood);
    }
}
