package oncall;

import java.util.ArrayList;
import java.util.List;

public class ApplicationView {

    private final InputView inputView;
    private final OutputView outputView;

    public ApplicationView(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
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
