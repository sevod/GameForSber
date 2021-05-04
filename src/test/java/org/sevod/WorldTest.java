package org.sevod;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorldTest {

    @Before
    public void createWorld()
    {
        World.getWorld();
    }

    @Test
    public void newWorld() {
        assertNotNull(World.getWorld());
    }

    @Test
    public void getLocation() {
        assertNotNull(World.getLocation(9, 5));
    }

    @Test
    public void getNumLocation() {
        assertTrue(World.getWorld().length >= 3);
    }
}