package oncall;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_WORKING_DAY = "비상 근무를 배정할 월과 시작 요일을 입력하세요> ";
    private static final String INPUT_WEEK_WORKER = "평일 비상 근무 순번대로 사원 닉네임을 입력하세요> ";
    private static final String INPUT_HOLI_WORKER = "휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> ";

    public String inputWorkingDayInfo() {
        println(INPUT_WORKING_DAY);
        return Console.readLine();
    }

    public String inputWeekWorker() {
        println(INPUT_WEEK_WORKER);
        return Console.readLine();
    }

    public String inputHoliWorker() {
        println(INPUT_HOLI_WORKER);
        return Console.readLine();
    }

    private void println(String message) {
        System.out.println(message);
    }
}
