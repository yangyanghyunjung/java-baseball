package view;

public class OutputView {
    private static final String CORRECT_3NUMBER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료"; // 네이밍
    private static final String CHOOES_RESTART_OR_EXIT= "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    // 숫자와 문자 조합하는 기능
    // parameter: List<Integer> (3,0,0) (1,1,0)
    public String Result() {

        return "";
    }
    // 화면에 출력하는 기능
    // parameter: String 결과
    public void printResult(String result) {
        System.out.println(result);
    }
}
