package net.game.playstaff;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Olga_Zlobina
 */
public class PlayerBTest {

    private static final int rounds = 100;

    @Test
    public void playTest() {
        Player playerB = new PlayerB();
        int paperCount = 0;
        for (int i=0;i<rounds;i++) {
            paperCount += playerB.play() == FigureType.PAPER ? 1 : 0;
        }

        assertTrue(rounds > paperCount);
    }
}
