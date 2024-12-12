package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    private String name;
    private List<String> hateFoods = new ArrayList<>();
    private List<String> recommendFoods = new ArrayList<>();

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

    public List<String> getRecommendFoods() {
        return recommendFoods;
    }

    public void updateHateFoods(List<String> hateFoods) {
        this.hateFoods = hateFoods;
    }

    public boolean isHateFood(String recommendFood) {
        return hateFoods.contains(recommendFood);
    }

    public boolean isDuplicate(String recommendFood) {
        return recommendFoods.contains(recommendFood);
    }

    public void addRecommendFood(String recommendFood) {
        this.recommendFoods.add(recommendFood);
    }
}
