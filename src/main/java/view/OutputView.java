package view;
import view.InputView;
public class OutputView {
    private static final String STRIKE = "3스트라이크";
    private static final String CORRECT_3NUMBER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료"; // 네이밍
    private static final String CHOOES_RESTART_OR_EXIT= "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    InputView inputView = new InputView();
    // 화면에 출력하는 기능
    // parameter: String 결과
    public void printResult(int strikeCount) {
        if (strikeCount == 3) {
            System.out.println(STRIKE);
            System.out.println(CORRECT_3NUMBER);
            System.out.println(CHOOES_RESTART_OR_EXIT);
        }
        inputView.ProgramReturnOrExit();
    }
}
