// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPLayers();

    Player addPlayer(Player player);

    Player getbyId(int playerId);

    Player modify(int playerId, Player player);

    void delete(int playerId);

}