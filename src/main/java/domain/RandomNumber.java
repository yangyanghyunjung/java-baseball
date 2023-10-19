package domain;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import controller.ComputerNumberDto;

public class RandomNumber {
    ComputerNumberDto computerNumberDto = new ComputerNumberDto();
    // 랜덤 생성 기능
    // parameter: x
    // return: List<int> 난수 3개
    // 어디서??? 호출 시 작동 =========================
    // 어디로 보낼거야?? ============================
    public void GenerateRandomNumber () {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        computerNumberDto.setComputerList(computer);
    }

}
