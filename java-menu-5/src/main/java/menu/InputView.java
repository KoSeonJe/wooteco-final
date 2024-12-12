package menu;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_COACH_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)";

    public String inputCoach() {
        println(INPUT_COACH_MESSAGE);
        return Console.readLine();
    }

    private void println(String message) {
        System.out.println(message);
    }
}
