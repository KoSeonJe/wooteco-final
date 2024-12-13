package oncall;

import java.util.ArrayList;
import java.util.List;

public class ApplicationView {

    private final InputView inputView;
    private final OutputView outputView;
    private final WorkerMapper workerMapper;

    public ApplicationView(InputView inputView, OutputView outputView, WorkerMapper workerMapper) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.workerMapper = workerMapper;
    }

    public List<String> inputWorkingDayInfo() {
        while (true) {
            try {
                String input = inputView.inputWorkingDayInfo();
                List<String> workingDayInfo = new ArrayList<>(List.of(input.split(",")));
                validateWorkingDay(workingDayInfo);
                return workingDayInfo;
            } catch (IllegalArgumentException e) {
                outputView.printIllegalError();
            }
        }
    }

    public List<WeekWorker> requireWeekWorker() {
        String input = inputView.inputWeekWorker();
        return workerMapper.toWeekWorkers(input);
    }

    public List<HoliWorker> requireHoliWorker() {
        String input = inputView.inputHoliWorker();
        return workerMapper.toHoliWorkers(input);
    }

    private void validateWorkingDay(List<String> workingDayInfo) {
        int month = Integer.parseInt(workingDayInfo.get(0));
        String dayOfWeek = workingDayInfo.get(1);
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException();
        }

        if (!DayOfWeek.isExist(dayOfWeek)) {
            throw new IllegalArgumentException();
        }
    }
}
