package net.game.playstaff;

/**
 * Figure types.
 * @author Olga_Zlobina
 */
public enum FigureType {
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    FigureType(int index) {
        this.index = index;
    }

    private final int index;

    public int getIndex() {
        return index;
    }


    public static FigureType getByIndex(int index) {
        for (FigureType figure : FigureType.values()) {
            if (figure.getIndex() == index) {
                return figure;
            }
        }
        return null;
    }
}
