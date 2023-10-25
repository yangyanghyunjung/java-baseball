package baseball;

import domain.RandomNumber;
import view.InputView;
import view.OutputView;

public class Application {
    public static void main(String[] args) {
//        Controller controller = new Controller();
//        controller.Controll();
        BaseballGame baseballGame = new BaseballGame(new InputView(), new OutputView(), new RandomNumber());
        baseballGame.start();
    }
}
