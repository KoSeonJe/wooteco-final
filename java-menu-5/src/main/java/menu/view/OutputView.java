package menu.view;

import java.util.List;
import menu.domain.Recommend;

public class OutputView {

    private static final String INTRODUCE_MESSAGE = "점심 메뉴 추천을 시작합니다.";
    private static final String RESULT_MESSAGE = "메뉴 추천 결과입니다.";
    private static final String DAYS = "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]";
    private static final String CATEGORIES = "[ 카테고리 | %s | %s | %s | %s | %s ]";
    private static final String EACH_COACH_RECOMMEND = "[ %s | %s | %s | %s | %s | %s ]";
    private static final String FINISH = "추천을 완료했습니다.";
    private static final String LINE_BREAKER = System.lineSeparator();

    public void printIntroduce() {
        println(INTRODUCE_MESSAGE);
    }

    public void printResult(List<Recommend> recommends) {
        println(LINE_BREAKER + RESULT_MESSAGE);
        println(DAYS);
        List<String> category = recommends.get(0).getCategories();
        System.out.printf(CATEGORIES + LINE_BREAKER, category.get(0),  category.get(1),  category.get(2),  category.get(3),  category.get(4));
        for (Recommend recommend : recommends) {
            System.out.printf(EACH_COACH_RECOMMEND + LINE_BREAKER,
                recommend.getCoachName(),
                recommend.getMenus().get(0),
                recommend.getMenus().get(1),
                recommend.getMenus().get(2),
                recommend.getMenus().get(3),
                recommend.getMenus().get(4)
            );
        }
        println(LINE_BREAKER + FINISH);
    }

    private void println(String message) {
        System.out.println(message);
    }
}
