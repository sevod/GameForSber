package org.sevod;

import java.util.Scanner;

/**
 * текстовая многопользовательская (может быть) компьютерная игра (MUD)
 */
public class Game
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String command;
        Location[][] world;
        Player player;
        boolean result;


        world = World.getWorld();
        player = new Player(9, 5, world[9][5]);

        System.out.println( "Глаза Алисы слипаются. Книга падает из рук." );
        System.out.println( "Мимо Алисы пробегает белый кролик. Кролик постоянно смотрит на часы." );
        System.out.println( "Какой то он странный подумала Алиса и побежала за ним.");

        result = true;
        while (result)
        {
            System.out.println(player.location.getDescription());
            command = scanner.nextLine();
            result = Action.action(command, player);
            System.out.println("---------------------------------------------------");
            if (command.equals("exit"))
                break;
        }

        System.out.println("И тут Алиса проснулась.");
        System.out.println("Если хотите повторить, перезапустите игру");
    }
}
