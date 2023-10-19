package view;

import controller.UserInputNumberDto;
import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String GAME_START_MESSAGE ="숫자 야구 게임을 시작합니다.";
    private static final String INPUT_NUMBER= "숫자를 입력해주세요";
    UserInputNumberDto userInputNumberDto = new UserInputNumberDto();

    // 사용자에게 숫자 입력 받는 화면 출력 함수
    // 리스트에 저장
    // 어디에 넘겨줌???========================
    public void InputUserNumber() {
        List<Integer> userInputNumberList = new ArrayList<>();
        System.out.println(GAME_START_MESSAGE); // 프로그램 시작

        while (userInputNumberList.size() < 3) { // 사용자 서로 다른 3숫자 입력
            System.out.println(INPUT_NUMBER);
            int inputValue = Integer.parseInt(Console.readLine());
            if (!userInputNumberList.contains(inputValue)) {
                userInputNumberList.add(inputValue);
            }

        }
        userInputNumberDto.setUserInputList(userInputNumberList); // setter로 넘겨줌.
    }
}
