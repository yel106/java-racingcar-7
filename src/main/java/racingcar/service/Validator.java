package racingcar.service;

import java.util.HashSet;
import java.util.Set;
import racingcar.domain.Message;

public class Validator {

    public static boolean isCarNameBlank(String[] carNameArray) {
        for (String carName : carNameArray) {
            if (carName == null || carName.isBlank()) {
                throw new IllegalArgumentException(Message.carNameBlankError());
            }
        }
        return false;
    }

    public static boolean isCarNameValidLength(String[] carNameArray) {
        for (String carName : carNameArray) {
            if (carName.trim().length() > 5) {
                throw new IllegalArgumentException(Message.carNameLengthError());
            }
        }
        return true;
    }

    public static boolean isCarNameDuplicate(String[] carNameArray) {
        Set<String> carNameList = new HashSet<>();

        for (String carName : carNameArray) {
            if (!carNameList.add(carName.trim())) {
                throw new IllegalArgumentException(Message.carNameDuplicationError());
            }
        }
        return false;
    }

    public static boolean isCarNameFormatValid(String[] carNameArray) {
        for (String carName : carNameArray) {
            if (!carName.matches("^[a-zA-Z]+$")) {
                throw new IllegalArgumentException(Message.carNameFormatError());
            }
        }
        return true;
    }

}