package domain;

import java.util.List;
import view.OutputView;
public class GenerateResult {
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";
    private static final String CORRECT_3NUMBER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료"; // 네이밍
    OutputView outputView = new OutputView();
    StringBuilder stringBuilder = new StringBuilder();

    // result String을 만드는 함수
    public Integer GenerateGameResult(List<Integer> result) {
        int ballCount = result.get(0);
        int strikeCount = result.get(1);
        int resultCode = 2;

        switch (result.indexOf(3)) {
            case 0:
                stringBuilder.append(ballCount);
                stringBuilder.append(BALL);
                break;
            case 1:
                stringBuilder.append(strikeCount);
                stringBuilder.append(STRIKE);
                stringBuilder.append(CORRECT_3NUMBER);
                resultCode = 1;
                break;
            case 2:
                stringBuilder.append(NOTHING);
                break;
            default:
                BallStrikeString(ballCount, strikeCount);
                break;
        }
        outputView.printResult(strikeCount);
        return resultCode;
    }

    // ball 볼 strike 스트라이크 를 조합하는 함수
    public void BallStrikeString(int ballCount, int strikeCount) {
        if (ballCount > 0) {
            stringBuilder.append(ballCount);
            stringBuilder.append(BALL);
        } else if (strikeCount > 0) {
            stringBuilder.append(strikeCount);
            stringBuilder.append(STRIKE);
        }
    }
}
