package org.sevod;

public class World {

    static private Location[][] world;
    static private final int x = 10;  //TODO избавиться от фиксированного размера
    static private final int y = 10;  //TODO избавиться от фиксированного размера


    private static Location[][] newWorld(){
        if (world == null)
            world = new Location[x][y];
        Inventory emptyInventory = new Inventory();
        Location startLocation = new Location("На дне кроличьей норы (9,5)", "Алиса стоит на дне кроличьей норы.", emptyInventory);
        world[9][5] = startLocation;

        Location location2 = new Location("Локация (8, 5)", "Алиса медленно падает в кроличью нору. Это может продолжаться вечно. Наберите \"Вперед\" и ее ноги коснутся пола", emptyInventory);
        world[8][5] = location2;

        Location location3 = new Location("Локация (7, 5)", "Алиса стоит на дне кроличьей норы.", emptyInventory);
        world[7][5] = location3;

        Location location4 = new Location("Локация (8, 4)", "Алиса стоит на дне кроличьей норы.", emptyInventory);
        world[8][4] = location4;

        Location location5 = new Location("Локация (8, 6)", "Алиса стоит на дне кроличьей норы.", emptyInventory);
        world[8][6] = location5;

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
