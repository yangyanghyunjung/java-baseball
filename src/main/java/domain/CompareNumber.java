package domain;
import java.util.ArrayList;
import java.util.List;

public class CompareNumber {
    private int nothing = 0;
    private int strike = 0;
    private int ball = 0;

    List<Integer> result = new ArrayList<>(3);

    // computer vs user 비교
    // parameter: com의 List<>, user의 List<>
    public List<Integer> CompareComputerAndUser(List<Integer> user, List<Integer> computer) {
        result.add(0, 0); // Reset ball
        result.add(1, 0); // Reset strike
        result.add(2, 0); // Reset nothing

        for (int i = 0; i < user.size(); i++) {
            if (user.get(i) == computer.get(i)) {
                strike++;
            }
            if (user.contains(i)) {
                BallOrStrike(i, user, computer);
            }
            else {
                result.set(2, nothing++);
            }
        }

        return result;
    }

    // 포함 되어있을 경우 위치값 일치하는지 확인하는 함수
    public void BallOrStrike(int number, List<Integer> user, List<Integer> computer) {
        int computerIndex = computer.indexOf(number);
        int userIndex = user.indexOf(number);

        if (computerIndex == userIndex) {
            result.set(0, strike++);
        } else {
            result.set(1, ball++);
        }
    }
}
