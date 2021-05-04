package org.sevod;

public class Player {
    Location location;
    Inventory inventory;

    int x;
    int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.location = World.getLocation(x, y);
    }
}
