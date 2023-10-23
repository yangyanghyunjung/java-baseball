package view;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String GAME_START_MESSAGE ="숫자 야구 게임을 시작합니다.";
    private static final String INPUT_NUMBER= "숫자를 입력해주세요:";
    List<Integer> userInputNumberList = new ArrayList<>();

    public void StartGameMessage() {
        System.out.println(GAME_START_MESSAGE); // 프로그램 시작
    }
    public void InputMessage() {
        System.out.println(INPUT_NUMBER); // 프로그램 시작
    }

    // 사용자에게 숫자 입력 받는 화면 출력 함수
    // return type: List<Integer>
    public List<Integer> InputUserNumber() {
        while (userInputNumberList.size() < 3) { // 사용자 서로 다른 3숫자 입력
            System.out.print(INPUT_NUMBER);
            String inputs = ValidateInputNumber(Console.readLine()); // 두번째 부터 error
            for (int i = 0; i < inputs.length(); i++) {
                char input = inputs.charAt(i);
                if (!userInputNumberList.contains(input - '0')) { //List에 한자리씩 추가
                    userInputNumberList.add(Integer.valueOf(input - '0'));
                } else if (userInputNumberList.contains(input - '0')) { // 메소드 따로 뺴고 싶음
                    throw new IllegalArgumentException("서로 다른 3자리 값을 입력해야 합니다.");
                }
            }
        }
        return userInputNumberList;
    }

    // 입력값 validation
    // return type: String (그대로 반환)
    public  String ValidateInputNumber(String inputs) {
        if (inputs.length() != 3) { // 3자리수 입력 안한 경우
            throw new IllegalArgumentException();
        }
        try { // int로 변경 불가인 경우
            Integer.parseInt(inputs);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException ("sd");
        }
        return inputs;
    }

    // 프로그램 재시작:1 / 종료:2 > boolean
    // return type: boolean
    public boolean ProgramReStartOrExit() {
        try { // 문자 입력 방지
            Integer input = Integer.parseInt(Console.readLine()); // int > Integer
            if (input == 1) {
                return true;
            } else if (input == 2) {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return false;
    }

    // List 초기화
    public void ClearList () {
        userInputNumberList.clear();
    }
}
