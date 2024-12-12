package menu.common;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DataInitializerTest {

    @DisplayName("")
    @Test
    void test() {
        Map<String, List<String>> map = DataInitializer.initFood();
        System.out.println(map.get("한식"));
    }
}
