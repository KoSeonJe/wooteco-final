package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import menu.domain.Coach;
import menu.repository.CoachRepository;
import menu.repository.FoodRepository;

public class RecommendService {

    private final FoodRepository foodRepository;
    private final CoachRepository coachRepository;

    public RecommendService(FoodRepository foodRepository, CoachRepository coachRepository) {
        this.foodRepository = foodRepository;
        this.coachRepository = coachRepository;
    }


    public void recommend() {
        List<String> categories = foodRepository.getAllCategories();
        List<String> recommendCategories = createRecommendCategories(categories);
        List<Coach> coaches = coachRepository.getAll();
        coaches.forEach(coach -> {
            recommendCategories.forEach(recommendCategory -> {
                List<String> menus = foodRepository.getMenusByCategory(recommendCategory);
                String recommendFood = getRecommendFood(coach, menus);
                coach.addRecommendFood(recommendFood);
            });
        });
    }

    private List<String> createRecommendCategories(List<String> categories) {
        List<String> recommendCategories = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String category = categories.get(Randoms.pickNumberInRange(1, 5));
            //TODO 3개 중복되면 예외
            recommendCategories.add(category);
        }
        return recommendCategories;
    }

    private String getRecommendFood(Coach coach, List<String> menus) {
        while (true) {
            String recommendFood = Randoms.shuffle(menus).get(0);
            if (validateMenu(coach, recommendFood)) {
                return recommendFood;
            }
        }
    }

    private boolean validateMenu(Coach coach, String recommendFood) {
        if (coach.isHateFood(recommendFood)) {
            return false;
        }

        if (coach.isDuplicate(recommendFood)) {
            return false;
        }

        return true;
    }
}
