package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_COACH_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String INPUT_HATE_FOODS = "(이)가 못 먹는 메뉴를 입력해 주세요.";

    public String inputCoach() {
        println(INPUT_COACH_MESSAGE);
        return Console.readLine();
    }

    public String inputHateFoods(String coachName) {
        println(coachName + INPUT_HATE_FOODS);
        return Console.readLine();
    }

    private void println(String message) {
        System.out.println(message);
    }
}
