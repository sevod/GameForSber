package org.sevod;

public class World {

    static private Location[][] world;
    static private final int x = 10;  //TODO избавиться от фиксированного размера
    static private final int y = 10;  //TODO избавиться от фиксированного размера


    private static Location[][] newWorld(){
        if (world == null)
            world = new Location[x][y];
        Inventory emptyInventory = new Inventory();
        Location startLocation = new Location("Вход в кроличью нору", "Алиса перед большим деревом, у нее под ногами кроличью нора.  Наберите \"Вперед\" и приключения начнутся ", emptyInventory);
        world[9][5] = startLocation;

        Location location2 = new Location("Падение в кроличью нору", "Алиса медленно падает в кроличью нору. Это может продолжаться вечно. Наберите \"Вперед\" и ее ноги коснутся пола", emptyInventory);
        world[8][5] = location2;

        Location location3 = new Location("На дне кроличьей норы", "Алиса стоит на дне кроличьей норы.", emptyInventory);
        world[7][5] = location3;

        return world;
    }

    public static Location[][] getWorld() {
        if (world == null)
            world = newWorld();
        return world;
    }

    public static Location getLocation(int x, int y) {
        return world[x][y];
    }
}
