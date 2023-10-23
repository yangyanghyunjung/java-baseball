package controller;

import domain.CompareNumber;
import domain.RandomNumber;
import java.util.List;
import view.InputView;
import view.OutputView;

public class Controller {
    // 전체적인 틀을 짜기
    public void Controll() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CompareNumber compareNumber = new CompareNumber();
        RandomNumber randomNumber = new RandomNumber();

        boolean restart = true;

        inputView.StartGameMessage(); // 게임시작 msg
        List<Integer> computer = randomNumber.GenerateRandomNumber(); // 난수 생성
        // 1. 입력값 받기 > 게임이 종료되지 않으면 (true면) 지속
        while (true) {
            // 결과 비교
            // random은 최초 한 한 번만 만들어져야함.
            List<Integer> result = compareNumber.CompareComputerAndUser(inputView.InputUserNumber(), computer);
            // 결과 출력
            outputView.printResult(result);
            if (result.get(1) == 3) { // strike 3이면
                // 재시작 종료 여부
                outputView.StrikeGameSet();
                outputView.ReStart();
                restart = inputView.ProgramReStartOrExit();
                if (restart) { // 2. 다시 시작일 경우
                    computer = randomNumber.GenerateRandomNumber();
                }
            }
            if (!restart) { // false면 종료
                break;
            }
            // InputUserNumber List<Integer>을 초기화 시키기.
            inputView.ClearList();
            compareNumber.ClearResultList();
        }
        outputView.GameSet();
    }
}
