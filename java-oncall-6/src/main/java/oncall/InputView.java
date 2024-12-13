package oncall;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_WORKING_DAY = "비상 근무를 배정할 월과 시작 요일을 입력하세요> ";

    public String inputWorkingDayInfo() {
        println(INPUT_WORKING_DAY);
        return Console.readLine();
    }

    private void println(String message) {
        System.out.println(message);
    }
}
