package org.sevod;
import java.util.HashMap;
import java.util.Map;

public class Location {
    String name;
    String description;
    Inventory inventory;
    Map<Direction, Location> direction;

    public Location(String name, String description, Inventory inventory) {
        this.name = name;
        this.description = description;
        this.inventory = inventory;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
