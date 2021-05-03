package org.sevod;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorldTest {

    @Test
    public void newWorld() {
        assertNotNull(World.getWorld());
    }

    @Test
    public void getLocation() {
        World.getWorld();
        assertNotNull(World.getLocation(9, 5));
    }
}