package org.sevod;

import java.util.Map;

public class Location {
    String name;
    String description;
    Inventory inventory;
    Map<Direction, Location> direction;
}
