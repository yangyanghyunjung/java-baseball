package domain;
import java.util.List;
import controller.UserInputNumberDto;
import controller.ComputerNumberDto;

public class CompareNumber {
    private List<Integer> userInputList;
    private List<Integer> computerList;
    private List<Integer> result;
    private int nothing = 0;
    private int strike = 0;
    private int ball = 0;
    UserInputNumberDto userInputNumberDto = new UserInputNumberDto();
    ComputerNumberDto computerNumberDto = new ComputerNumberDto();

    // computer vs user 비교
    // parameter: com의 List<>, user의 List<>
    public List<Integer> CompareComAndUser() {
        for (int i: computerList) {
            if (userInputList.contains(i)) {
                BallOrStrike(i);
            } else {
                nothing++;
            }
        }
        result.add(ball);
        result.add(strike);
        result.add(nothing);
        return result;
    }

    // 포함 되어있을 경우 위치값 일치하는지 확인하는 함수
    public void BallOrStrike(int number) {
        int computerIndex = computerList.indexOf(number);
        int userIndex = userInputList.indexOf(number);

        if (computerIndex == userIndex) {
            strike++;
        } else {
            ball++;
        }

    }
    // dto의 user List 데이터 가져오는 함수
    public void GetUserInputList() {
        this.userInputList = userInputNumberDto.getUserInputList(); //this??
    }

    // dto의 computer List 데이터 가져오는 함수
    public void GetComputerList() {
        this.computerList = computerNumberDto.getComputerList(); //this??
    }

}
