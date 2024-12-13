package oncall.view;

public class OutputView {

    private static final String ILLEGAL_MESSAGE = "[ERROR] 올바르지 않은 형식입니다. 다시 입력해주세요.";

    public void printIllegalError() {
        println(ILLEGAL_MESSAGE);
    }

    private void println(String message) {
        System.out.println(message);
    }
}
