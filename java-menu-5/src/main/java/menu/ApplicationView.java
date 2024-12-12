package menu;

import java.util.ArrayList;
import java.util.List;

public class ApplicationView {

    private static final String COACH_NAME_DELIMITER = ",";

    private final InputView inputView;
    private final OutputView outputView;

    public ApplicationView(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void introduce() {
        outputView.printIntroduce();
    }

    public List<String> inputCoach() {
        String coachNames = inputView.inputCoach();
        return new ArrayList<>(List.of(coachNames.split(COACH_NAME_DELIMITER)));
    }
}
