package controller;

import java.util.List;

public class ComputerNumberDto {
    private List<Integer> computerList;

    // getter
    public List<Integer> getComputerList() {
        return this.computerList;
    }

    // setter
    private void setComputerList(List<Integer> computerList) {
        this.computerList = computerList;
    }
}
