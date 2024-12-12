package menu.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class DataInitializer {

    private static final String FOOD_DATA = "일식: 규동, 우동, 미소시루, 스시, 가츠동, 오니기리, 하이라이스, 라멘, 오코노미야끼\n"
        + "한식: 김밥, 김치찌개, 쌈밥, 된장찌개, 비빔밥, 칼국수, 불고기, 떡볶이, 제육볶음\n"
        + "중식: 깐풍기, 볶음면, 동파육, 짜장면, 짬뽕, 마파두부, 탕수육, 토마토 달걀볶음, 고추잡채\n"
        + "아시안: 팟타이, 카오 팟, 나시고렝, 파인애플 볶음밥, 쌀국수, 똠얌꿍, 반미, 월남쌈, 분짜\n"
        + "양식: 라자냐, 그라탱, 뇨끼, 끼슈, 프렌치 토스트, 바게트, 스파게티, 피자, 파니니";

    public static Map<String, List<String>> initFood() {
        StringTokenizer tokenizer = new StringTokenizer(FOOD_DATA, "\n");
        Map<String, List<String>> foodMenus = new HashMap<>();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            String category = token.split(": ")[0];
            String menu = token.split(": ")[1];
            List<String> menus = List.of(menu.split(", "));
            foodMenus.put(category, menus);
        }
        return foodMenus;
    }

    public static List<String> initCategory() {
        StringTokenizer tokenizer = new StringTokenizer(FOOD_DATA, "\n");
        List<String> categories = new ArrayList<>();
        categories.add(" ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            String category = token.split(": ")[0];
            categories.add(category);
        }
        return categories;
    }
}
