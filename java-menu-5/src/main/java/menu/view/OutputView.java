package menu.view;

public class OutputView {

    private static final String INTRODUCE_MESSAGE = "점심 메뉴 추천을 시작합니다.";

    public void printIntroduce() {
        println(INTRODUCE_MESSAGE);
    }

    private void println(String message) {
        System.out.println(message);
    }
}
