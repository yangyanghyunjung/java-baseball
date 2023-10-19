package controller;

import java.util.List;

public class UserInputNumberDto {
    // user가 view에 입력한 number list getter / setter
    private List<Integer> userInputList;

    // getter
    public List<Integer> getUserInputList () {
        return this.userInputList;
    }

    // setter
    public void setUserInputList(List<Integer> userInputList) {
        this.userInputList = userInputList;
    }
}
