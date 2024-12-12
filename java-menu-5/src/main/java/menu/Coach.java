package menu;

import java.util.List;

public class Coach {

    private String name;
    private List<String> hateFoods;

    public Coach(String name) {
        this.name = name;
    }

    public static Coach create(String name) {
        return new Coach(name);
    }

    public String getName() {
        return name;
    }

    public List<String> getHateFoods() {
        return hateFoods;
    }

    public void updateHateFoods(List<String> hateFoods) {
        this.hateFoods = hateFoods;
    }
}
