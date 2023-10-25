package view;

import domain.BallStrikeNothing;

public class OutputView {
    final String STRIKE = "스트라이크";
    final String BALL = "볼";
    final String NOTHING = "낫싱";
    public static final String CORRECT_3NUMBER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료"; // 네이밍

    public static final String GAME_SET = "게임 종료";


    InputView inputView;
    BallStrikeNothing ballStrikeNothing;

    // 화면에 출력하는 기능
    // parameter: String 결과
    public void printResult() {
        System.out.println(OutputFormat()); // format 출력
//        System.out.println(CHOOES_RESTART_OR_EXIT); // 별개 메소드로 분리 해야함

    }

    // 출력 Format
    // return type: String
    // parameter:
    public String OutputFormat() {
        StringBuilder sb = new StringBuilder(32);
        if (ballStrikeNothing.ball > 0) { // 볼
            sb.append(ballStrikeNothing.ball + BALL + " ");
        }
        if (ballStrikeNothing.strike > 0) { //스트라이크
            sb.append(ballStrikeNothing.strike + STRIKE);
            sb.append(CORRECT_3NUMBER);
        }
        if (ballStrikeNothing.ball == 3) { //낫싱
            sb.append(NOTHING);
        }
        return sb.toString();
    }

    public String PrintReStart() {
        String inputCode = "";
        if (ballStrikeNothing.strike == inputView.NUMBER_LENGTH) {
            System.out.println(inputView.CHOOES_RESTART_OR_EXIT);
            inputCode = inputView.ProgramReStartOrExit();
            System.out.println(inputCode);
        }
        return inputCode;
    }

    // 3스트라이크 게임종료
    // return type: void, just print
    // parameter:
//    public void StrikeGameSet() {
//        System.out.println(CORRECT_3NUMBER);
//    }

    // 2 게임종료
    // return type: void, just print
    // parameter:
//    public void GameSet() {
//        System.out.println(GAME_SET);
//    }


}
