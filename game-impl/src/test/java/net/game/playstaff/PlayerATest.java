package net.game.playstaff;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Olga_Zlobina
 */
public class PlayerATest{

    private static final int rounds = 100;

    @Test
    public void playTest() {
        Player playerA = new PlayerA();
        for (int i=0;i<rounds;i++) {
            assertEquals(playerA.play(), FigureType.PAPER);
        }
    }
}
