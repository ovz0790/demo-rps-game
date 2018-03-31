package net.game.playstaff;

import java.util.Random;

/**
 * @author Olga_Zlobina
 */
public class PlayerB extends Player {

    private final Random random = new Random();

    @Override
    public FigureType play() {
        int figure = random.nextInt(3);
        return FigureType.getByIndex(figure);
    }
}
