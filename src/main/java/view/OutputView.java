package view;
import view.InputView;

import java.util.List;

public class OutputView {
    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";
    public static final String CORRECT_3NUMBER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료"; // 네이밍
    private static final String CHOOES_RESTART_OR_EXIT= "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    InputView inputView = new InputView();
    // 화면에 출력하는 기능
    // parameter: String 결과
    public void printResult(List<Integer> result) {
        System.out.println(OutputFormat(result)); // format 출력
        System.out.println(CHOOES_RESTART_OR_EXIT);
        inputView.ProgramReStartOrExit();
    }

    // 출력 Format
    // return type: String
    // parameter:
    public String OutputFormat(List<Integer> result) {
        StringBuilder sb = new StringBuilder(524);
        if (result.get(0) > 0) { // 볼
            sb.append(result.get(0) + BALL);
        }
        if (result.get(1) > 0) { //스트라이크
            sb.append(result.get(1) + STRIKE);
        }
        if (result.get(2) == 3) { //낫싱
            sb.append(NOTHING);
        }
        return sb.toString();
    }

    // 3스트라이크 게임종료
    // return type: void, just print
    // parameter:
    public void StrikeGameSet() {
        System.out.println(CORRECT_3NUMBER);
    }

    // 재시작
    // return type: void, just print
    // parameter:
    public void ReStart() {
        System.out.println(CHOOES_RESTART_OR_EXIT);
    }
}
