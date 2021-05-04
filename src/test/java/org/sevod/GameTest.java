package org.sevod;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GameTest
{
    Player player;
    Location[][] world;

    @Before
    public void createWorld()
    {
        world = World.getWorld();
        player = new Player(8, 5);
    }


    @Test
    public void goForward()
    {
        assertTrue( Action.action("вперед", player));
    }

    @Test
    public void goBack()
    {
        assertTrue( Action.action("назад", player));
    }

    @Test
    public void goLeft()
    {
        assertTrue( Action.action("влево", player));
    }

    @Test
    public void goRight()
    {
        assertTrue( Action.action("вправо", player));
    }
}
