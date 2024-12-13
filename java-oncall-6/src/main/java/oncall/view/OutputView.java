package oncall.view;

import java.util.List;
import oncall.domain.Work;

public class OutputView {

    private static final String ILLEGAL_MESSAGE = "[ERROR] 올바르지 않은 형식입니다. 다시 입력해주세요.";
    private static final String WORK_SCHEDULE = "%d월 %d일 %s %s";
    private static final String HOLI_WORK_SCHEDULE = "%d월 %d일(휴일) %s %s";
    private static final String LINE_BREAKER = System.lineSeparator();

    public void printIllegalError() {
        println(ILLEGAL_MESSAGE);
    }

    public void printWorkSchedule(List<Work> works) {
        for (int day = 1; day <= works.size(); day++) {
            Work work = works.get(day-1);
            if (work.getCustomMonth().isHoliday(day)) {
                System.out.printf(HOLI_WORK_SCHEDULE + LINE_BREAKER,
                    work.getCustomMonth().getMonth(),
                    day,
                    work.getDayOfWeek().getDescription(),
                    work.getWorker());
            }
            System.out.printf(WORK_SCHEDULE + LINE_BREAKER,
                work.getCustomMonth().getMonth(),
                day,
                work.getDayOfWeek().getDescription(),
                work.getWorker());
        }
    }

    private void println(String message) {
        System.out.println(message);
    }
}
