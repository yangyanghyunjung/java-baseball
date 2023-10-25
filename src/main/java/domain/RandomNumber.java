package domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumber {
    private final int MIN_RANDOM_NUMBER = 1;
    private final int MAX_RANDOM_NUMBER = 9;

    // 랜덤 생성 기능
    // return: List<int> 난수 3개 computer
    // refecter: : List > HashSet, final , add
    public List<Integer> GenerateRandomNumber() {
//        List<Integer> computer = new ArrayList<>();
        Set<Integer> computer = new HashSet<>(); // refect: List > Set
        while (computer.size() < 3) {
//            int randomNumber = Randoms.pickNumberInRange(1, 9);
            // refect: 1.한번에 add, 2.magicNumber > 상수
            computer.add(Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER));
        }
        return new ArrayList<>(computer); // refect
    }
}
