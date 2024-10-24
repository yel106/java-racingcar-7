package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Message;

public class GameView {

    public String getInputCarNames() {

        System.out.println(Message.promptInputCarNames());
        String carNamesInput = Console.readLine();
        return carNamesInput.trim();
    }

    public String getInputTryCount() {
        System.out.println(Message.promptInputTryCount());
        String tryCountInput = Console.readLine();
        return tryCountInput.trim();
    }




}
