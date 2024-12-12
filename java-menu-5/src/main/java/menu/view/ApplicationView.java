package menu.view;

import java.util.ArrayList;
import java.util.List;
import menu.domain.Recommend;

public class ApplicationView {

    private static final String COACH_NAME_DELIMITER = ",";
    private static final String HATE_FOOD_DELIMITER = ",";

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

    public List<String> inputHateFoods(String coachName) {
        String hateFoods = inputView.inputHateFoods(coachName);
        return new ArrayList<>(List.of(hateFoods.split(HATE_FOOD_DELIMITER)));
    }

    public void printResult(List<Recommend> recommends) {
        outputView.printResult(recommends);
    }
}
