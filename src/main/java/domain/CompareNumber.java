package domain;

import java.util.List;
import java.util.stream.IntStream;

public class CompareNumber {
    //    private int nothing = 0;
//    private int strike = 0;
//    private int ball = 0;
    private BallStrikeNothing ballStrikeNothing;

    List<Integer> user;
    List<Integer> computer;

    public CompareNumber(List<Integer> user, List<Integer> computer) {
        this.user = user;
        this.computer = computer;
    }

//    List<Integer> result = new ArrayList<>(3);

    // computer vs user 비교
    // parameter: none
    public void CompareComputerAndUser() {

        ballStrikeNothing.strike = StrikeCount();
        ballStrikeNothing.ball = BallCount();
        ballStrikeNothing.nothing = NothingCount();

        List<Integer> result = List.of(ballStrikeNothing.ball, ballStrikeNothing.strike, ballStrikeNothing.nothing);
    }

    // strike
    public int StrikeCount() {
        return (int) IntStream.range(0, user.size())
                .filter(i -> computer.get(i).equals(user.get(i)))
                .count();
    }

    // ball
    public int BallCount() {
        return (int) IntStream.range(0, user.size())
                .filter(i -> computer.contains(user.get(i)))
                .count() - ballStrikeNothing.strike; // 중복 방지
    }

    // nothing
    public int NothingCount() {
        return 3 - ballStrikeNothing.strike - ballStrikeNothing.ball;
    }
}
