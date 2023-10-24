package baseball.controller;

import baseball.model.ComputerNumberDto;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> computerRandomNumbers = new ArrayList<>();
    private ComputerNumberDto computerNumberDto;

    public ComputerNumberDto getRandomComputerNumber(){
        setTargetNumber();
        setComputerNumberDto();
        return computerNumberDto;
    }

    private void setTargetNumber(){
        while(computerRandomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerRandomNumbers.contains(randomNumber)) {
                computerRandomNumbers.add(randomNumber);
            }
        }
    }

    private void setComputerNumberDto(){
        computerNumberDto.setComputerNumber(computerRandomNumbers);
    }
}
