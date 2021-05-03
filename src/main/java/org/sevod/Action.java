package org.sevod;

import java.util.Locale;

public class Action {
    private static boolean result;

    static boolean action(String command, Player player){
        result = true;
        command = command.toLowerCase();
        if (command.equals("вперед"))
            result = Move.getForward(player);

        return result;
    }
}
