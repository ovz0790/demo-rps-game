package net.game.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import net.game.playstaff.Player;
import net.game.playstaff.PlayerA;
import net.game.playstaff.PlayerB;
import org.junit.Test;

/**
 * Game round with two players implementation test.
 * @author Olga_Zlobina
 */
public class GameTest{
    private static final int rounds = 100;

    @Test
    public void checkWhoHadWinTest() {
        Player[] players = new Player[]{
                new PlayerA(),
                new PlayerB()};
        Game game = new GameImpl();

        for (int i=0; i<rounds; i++) {
            game.checkWhoHadWin(players);
        }

        for (Player p : players) {
            assertEquals(p.getPlayedGamesCount(), rounds);

            assertTrue(p.getWinsCount() <= rounds);

        }

        assertEquals(players[0].getTieCount(), players[1].getTieCount());
        assertEquals(rounds, players[0].getWinsCount() +
                players[1].getWinsCount() +
                players[0].getTieCount());

    }
}
