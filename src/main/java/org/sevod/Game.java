package org.sevod;

import java.util.Scanner;

/**
 * текстовая многопользовательская (может быть) компьютерная игра (MUD)
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        Player player;
        boolean result;

        World.getWorld();
        player = new Player(9, 5);  //TODO задаю вручную, что не очень хорошо
        System.out.println("Глаза Алисы слипаются. Книга падает из рук.");
        System.out.println("Мимо Алисы пробегает белый кролик. Кролик постоянно смотрит на часы.");
        System.out.println("Какой то он странный подумала Алиса и побежала за ним.");
        System.out.println("Алиса перед большим деревом, у нее под ногами кроличью нора.");
        System.out.println("Алиса делает шаг в перед и медленно падает в кроличью нору.");
        System.out.println("Приключения начинаются!");
        System.out.println("---------------------------------------------------");

        result = true;
        while (result) {
            System.out.println(player.location.getDescription());
            command = scanner.nextLine();
            result = Action.action(command, player);
            System.out.println("---------------------------------------------------");
        }

        System.out.println("И тут Алиса проснулась.");
        System.out.println("Если хотите повторить, перезапустите игру");
    }
}
