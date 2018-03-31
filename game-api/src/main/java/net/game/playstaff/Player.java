package net.game.playstaff;

/**
 * Player.
 * @author Olga_Zlobina
 */
public abstract class Player {

    private int winsCount;

    private int playedGamesCount;

    private int tieCount;

    public int  getTieCount() {
        return tieCount;
    }

    public int getWinsCount() {
        return winsCount;
    }

    public int getPlayedGamesCount() {
        return playedGamesCount;
    }

    public void incrementScore(Boolean isWinner) {
        playedGamesCount++;

        if (isWinner == null) {
            tieCount++;
            return;
        }

        winsCount += isWinner ? 1 : 0;

    }

    abstract public FigureType play();
}
