package net.game.service;

import static net.game.playstaff.FigureType.PAPER;
import static net.game.playstaff.FigureType.ROCK;
import static net.game.playstaff.FigureType.SCISSORS;

import net.game.playstaff.FigureType;
import net.game.playstaff.Player;

/**
 * Game round with two players implementation.
 * @author Olga_Zlobina
 */
public class GameImpl implements Game {

    private final int[][] winMatrix;

    public GameImpl() {
        winMatrix = new int[3][3];
        winMatrix[ROCK.getIndex()][PAPER.getIndex()]
                = winMatrix[PAPER.getIndex()][ROCK.getIndex()] = PAPER.getIndex();
        winMatrix[ROCK.getIndex()][SCISSORS.getIndex()]
                = winMatrix[SCISSORS.getIndex()][ROCK.getIndex()] = ROCK.getIndex();
        winMatrix[PAPER.getIndex()][SCISSORS.getIndex()]
                = winMatrix[SCISSORS.getIndex()][PAPER.getIndex()] = SCISSORS.getIndex();
    }

    @Override
    public Player checkWhoHadWin(Player[] players) {
        FigureType ft1 = players[0].play();
        FigureType ft2 = players[1].play();

        if (ft2.getIndex() == ft1.getIndex()) {
            for (Player p : players) {
                p.incrementScore(null);
            }
            return null;
        }
        int winnerFigureIndex = winMatrix[ft1.getIndex()][ft2.getIndex()];

        int winnerIndex = ft1.getIndex() == winnerFigureIndex ? 0 : 1;

        players[winnerIndex].incrementScore(true);
        players[(1-winnerIndex)].incrementScore(false);

        return players[winnerIndex];
    }
}
