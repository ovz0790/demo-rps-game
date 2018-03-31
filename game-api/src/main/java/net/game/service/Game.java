package net.game.service;

import net.game.playstaff.Player;

/**
 * Game round with two players.
 * @author Olga_Zlobina
 */
public interface Game {

    Player checkWhoHadWin(Player[] players);
}
