package controller;
import view.InputView;
import domain.CompareNumber;
import domain.RandomNumber;

public class Controller {
    // 기능들을 조합하는 함수
    public void Controll() {
        InputView inputView = new InputView();
        CompareNumber compareNumber = new CompareNumber();
        RandomNumber randomNumber = new RandomNumber();

        inputView.InputUserNumber();
        randomNumber.GenerateRandomNumber();
        int resultCode = compareNumber.CompareComputerAndUser();

        while (resultCode == 1) {
            inputView.InputUserNumber();
            resultCode = compareNumber.CompareComputerAndUser();
        }

    }


}
