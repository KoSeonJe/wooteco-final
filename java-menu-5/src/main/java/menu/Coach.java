package menu;

public class Coach {

    private String name;

    public Coach(String name) {
        this.name = name;
    }

    public static Coach create(String name) {
        return new Coach(name);
    }

    public String getName() {
        return name;
    }
}
