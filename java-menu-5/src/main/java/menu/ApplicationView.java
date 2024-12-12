package menu;

public class ApplicationView {

    private final InputView inputView;
    private final OutputView outputView;

    public ApplicationView(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void introduce() {
        outputView.printIntroduce();
    }
}
