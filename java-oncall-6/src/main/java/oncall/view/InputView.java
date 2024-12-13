package oncall.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_WORKING_DAY = "비상 근무를 배정할 월과 시작 요일을 입력하세요> ";
    private static final String INPUT_WEEK_WORKER = "평일 비상 근무 순번대로 사원 닉네임을 입력하세요> ";
    private static final String INPUT_HOLI_WORKER = "휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> ";

    public String inputWorkingDayInfo() {
        print(INPUT_WORKING_DAY);
        return Console.readLine();
    }

    public String inputWeekWorker() {
        print(INPUT_WEEK_WORKER);
        return Console.readLine();
    }

    public String inputHoliWorker() {
        print(INPUT_HOLI_WORKER);
        return Console.readLine();
    }

    private void print(String message) {
        System.out.print(message);
    }
}
