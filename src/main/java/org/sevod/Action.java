package org.sevod;

public class Action {

    static boolean action(String command, Player player){
        boolean result = true;
        command = command.toLowerCase();
        if (command.equals("вперед"))
            result = Move.getForward(player);
        else if (command.equals("назад"))
            result = Move.getBack(player);
        else if (command.equals("влево"))
            result = Move.getLeft(player);
        else if (command.equals("вправо"))
            result = Move.getRight(player);
        else if (command.equals("выйти"))
            result = false;
        else
            System.out.println("Неправильная команда");

        return result;
    }
}
