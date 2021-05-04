package org.sevod;

public class Move {
    private static boolean result;

    public static boolean getForward(Player player)
    {
        result = false;
        Location location = World.getLocation(player.x - 1, player.y);
        if (location != null){
            result = true;
            player.x = player.x - 1;
            player.location = location;
        }
        return result;
    }

    public static boolean getBack(Player player)
    {
        result = false;
        Location location = World.getLocation(player.x + 1, player.y);
        if (location != null){
            result = true;
            player.x = player.x + 1;
            player.location = location;
        }
        return result;
    }

    public static boolean getLeft(Player player)
    {
        result = false;
        Location location = World.getLocation(player.x, player.y - 1);
        if (location != null){
            result = true;
            player.y = player.y - 1;
            player.location = location;
        }
        return result;
    }

    public static boolean getRight(Player player)
    {
        result = false;
        Location location = World.getLocation(player.x, player.y + 1);
        if (location != null){
            result = true;
            player.y = player.y + 1;
            player.location = location;
        }
        return result;
    }
}
