package domain;
import java.util.List;
import controller.UserInputNumberDto;
import controller.ComputerNumberDto;
import domain.GenerateResult;

public class CompareNumber {
    private int nothing = 0;
    private int strike = 0;
    private int ball = 0;
//    private List<Integer> userInputList;
//    private List<Integer> computerList;
    private List<Integer> result = List.of(ball, strike, nothing);
    UserInputNumberDto userInputNumberDto = new UserInputNumberDto();
    ComputerNumberDto computerNumberDto = new ComputerNumberDto();
    GenerateResult generateResult = new GenerateResult();
    private List<Integer> userInputList = userInputNumberDto.getUserInputList();
    private List<Integer> computerList = computerNumberDto.getComputerList();

    // computer vs user 비교
    // parameter: com의 List<>, user의 List<>
    public int CompareComputerAndUser() {
        for (int i: computerList) {
            if (userInputList.contains(i)) {
                BallOrStrike(i);
            } else {
                result.set(2, nothing++);
            }
        }

        return generateResult.GenerateGameResult(result) ;
    }

    // 포함 되어있을 경우 위치값 일치하는지 확인하는 함수
    public void BallOrStrike(int number) {
        int computerIndex = computerList.indexOf(number);
        int userIndex = userInputList.indexOf(number);

        if (computerIndex == userIndex) {
            result.set(0, strike++);
        } else {
            result.set(1, ball++);
        }

    }
    // dto의 user List 데이터 가져오는 함수
//    public void GetUserInputList() {
//        this.userInputList = userInputNumberDto.getUserInputList(); //this??
//    }
//
//    // dto의 computer List 데이터 가져오는 함수
//    public void GetComputerList() {
//        this.computerList = computerNumberDto.getComputerList(); //this??
//    }

}
