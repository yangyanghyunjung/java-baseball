//package controller;
//
//import domain.CompareNumber;
//import domain.RandomNumber;
//import java.util.List;
//import view.InputView;
//import view.OutputView;
//
//public class Controller {
//    // 멤버 변수 정리 하세요.
//    static final String restart = "1";
//    static final String exit = "2";
//    InputView inputView = new InputView();
//    OutputView outputView = new OutputView();
//    CompareNumber compareNumber = new CompareNumber();
//    RandomNumber randomNumber = new RandomNumber();
//
//    // 전체적인 틀을 짜기
//    List<Integer> computer = randomNumber.GenerateRandomNumber(); // 난수 생성
//
//    public void Controll() {
//        System.out.println(inputView.GAME_START_MESSAGE);  // 게임시작 msg
//
//        // 1. 입력값 받기 > 게임이 종료되지 않으면 (true면) 지속
//        while (true) {
//            // 결과 비교
//            // random은 최초 한 한 번만 만들어져야함.
//            List<Integer> result = compareNumber.CompareComputerAndUser();
//            // 결과 출력
//            outputView.printResult(result);
//            if (exit.equals(ReStartExitCode(result))) { // false면 종료
//                break;
//            }
//            compareNumber.ClearResultList(); // 맘에 안듬
//        }
//        System.out.println(outputView.GAME_SET);
//    }
//
//    // 재시작 종료
//    public String ReStartExitCode(List<Integer> result) {
//        String reStartOrExitInput = "";
//        if (result.get(1) == 3) { // strike 3이면
//            reStartOrExitInput = inputView.ProgramReStartOrExit();
//            // 재시작 종료 여부
//            System.out.println(outputView.CORRECT_3NUMBER);
//            inputView.ReStart(); // input으로
//            if (restart.equals(reStartOrExitInput)) { // 2. 다시 시작일 경우
//                computer = randomNumber.GenerateRandomNumber();
//            }
//        }
//        return reStartOrExitInput;
//    }
//}
