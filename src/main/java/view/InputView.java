package view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    static final String INPUT_NUMBER = "숫자를 입력해주세요:";
    public static final String CHOOES_RESTART_OR_EXIT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    static final String NUMBER_REGULAR_EXPRESSION = "^[1-9]{3}$";
    static final String EXIT_REGULAR_EXPRESSION = "^[1-2]{1}$";
    public static final int NUMBER_LENGTH = 3;
    public static final String exit = "2";
    public static final String restart = "1";


    // 사용자에게 숫자 입력  받는 화면 출력 함수
    // return type: List<Integer>
    public List<Integer> InputUserNumber() {

        System.out.print(INPUT_NUMBER);
//        while (userInputNumberList.size() < 3) { // 사용자 서로 다른 3숫자 입력
        String inputString = Console.readLine();
        System.out.println(inputString);
        ValidateInputNumber(inputString); // 이걸 여기서?? 분리 하고 싶음 > 기능이 다름

//        }
        return AddNumber(inputString);
    }

    // 입력값 validation: 3자리수, int로 pasrsing
    // return type: String (그대로 반환)
//    public String ValidateInputNumber(String inputs) {
//        if (inputs.length() != 3) { // 3자리수 입력 안한 경우
//            throw new IllegalArgumentException();
//        }
//        try { // int로 변경 불가인 경우
//            Integer.parseInt(inputs);
//        } catch (IllegalArgumentException e) {
//            throw new IllegalArgumentException("숫자만 입력해야 합니다.");
//        }
//
//        for (int i = 0; i < inputs.length(); i++) {
//            int input = inputs.charAt(i) - '0';
//            if (!userInputNumberList.contains(input)) { //List에 한자리씩 추가
//                userInputNumberList.add(Integer.valueOf(input));
//            } else if (userInputNumberList.contains(input)) { // 메소드 따로 뺴고 싶음
//                throw new IllegalArgumentException("서로 다른 3자리 값을 입력해야 합니다.");
//            }
//        }
//        return inputs;
//    }

    // (3)길이, 숫자 체크 > refect
    public void ValidateInputNumber(String inputs) {
        if (!inputs.matches(NUMBER_REGULAR_EXPRESSION)) {
            throw new IllegalArgumentException("3자리의 숫자를 입력해야 합니다.");
        }
    }

    // (3)중복 체크 > refect
    public void ValidateDuplicate(List<Integer> userNumbers, int number) {
        if (userNumbers.contains(number)) {
            throw new IllegalArgumentException("중복된 숫자를 입력헸습니다.");
        }
    }

    // int로 pasring후 List<>
    // 중복 됐으면 throw
    public List<Integer> AddNumber(String input) {
        List<Integer> userNumbers = new ArrayList<>(); // refect 이때 초기화가 되니까 clear 안해도 됨
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            int number = input.charAt(i) - '0';
            ValidateDuplicate(userNumbers, number);
            userNumbers.add(number);
        }
        return userNumbers;
    }

    // 프로그램 재시작:1 / 종료:2 > boolean
    // return type: boolean
    public String ProgramReStartOrExit() {
//        try { // 문자 입력 방지
//            Integer input = Integer.parseInt(Console.readLine()); // int > Integer
//            if (input == 1) {
//                return true;
//            } else if (input == 2) {
//                return false;
//            }
//        } catch (IllegalArgumentException e) {
//            throw e;
//        }
//        return false;
        String number = Console.readLine();
        ValidateReStartOrExit(number);
        return number;
    }

    public void ValidateReStartOrExit(String input) {
        if (!input.matches(EXIT_REGULAR_EXPRESSION)) {
            throw new IllegalArgumentException("1 과 2 만 입력할 수 있습니다.");
        }

    }

    // List 초기화 refecter : List<>를 멤버변수가 아닌method 안에 선언해서 초기화 필요 x
//    public void ClearList() {
//        userNumbers.clear();
//    }
}
