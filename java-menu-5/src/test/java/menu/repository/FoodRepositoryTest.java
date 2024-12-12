package menu.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodRepositoryTest {

    @DisplayName("")
    @Test
    void test() {
        FoodRepository foodRepository = FoodRepository.getInstance();
        System.out.println(foodRepository.getMenusByCategory("한식"));
    }
}
