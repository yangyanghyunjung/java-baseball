package baseball;

import domain.BallStrikeNothing;
import domain.CompareNumber;
import domain.RandomNumber;
import java.util.List;
import view.InputView;
import view.OutputView;

public class BaseballGame {
    InputView inputView;
    OutputView outputView;
    RandomNumber randomNumber;


    List<Integer> computer;
    BallStrikeNothing ballStrikeNothing;

    public BaseballGame(InputView inputView, OutputView outputView, RandomNumber randomNumber) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.randomNumber = randomNumber;
    }

    // 게임 시작 -> 2를 입력하면 종료
    public void start() {
        System.out.println(inputView.GAME_START_MESSAGE);
        while (true) {
            boolean play = Play();
            if (!play) {
                System.out.println(outputView.GAME_SET);
                break;
            }
        }
    }

    // 게임 play -> 숫자를 맞추면 종료
    public boolean Play() {
        computer = randomNumber.GenerateRandomNumber();
        while (true) {
            CompareNumber compareNumber = new CompareNumber(inputView.InputUserNumber(), computer);
            compareNumber.CompareComputerAndUser();
            outputView.printResult();

            if (outputView.PrintReStart() == inputView.exit) { // false면 종료
                return false;
            }
        }
    }
}
