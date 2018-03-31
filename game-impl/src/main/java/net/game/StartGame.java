package net.game;

import net.game.playstaff.Player;
import net.game.playstaff.PlayerA;
import net.game.playstaff.PlayerB;
import net.game.service.Game;
import net.game.service.GameImpl;

/**
 * @author Olga_Zlobina
 */
public class StartGame {

    public static void main(String[] args) {
        int roundCount = 100;

        if (args.length > 0) {
            try {
                roundCount = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Rounds count parameter should be integer number."
                        + " Default is 100");
                return;
            }
        }

        Player[] players = new Player[]{
                new PlayerA(),
                new PlayerB()};
        Game game = new GameImpl();

        for (int i=0; i<roundCount; i++) {
            game.checkWhoHadWin(players);
        }

        for (Player p : players) {
            System.out.println(String.format("Player %s wins %d of %d games",
                    p.getClass().getSimpleName().charAt(6),
                    p.getWinsCount(),
                    p.getPlayedGamesCount()));
        }
        System.out.println(String.format("Tie: %d of %d games",
                players[0].getTieCount(),
                players[0].getPlayedGamesCount()));
    }
}
