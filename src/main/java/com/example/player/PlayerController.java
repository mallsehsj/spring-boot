/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */
package com.example.player;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.example.player.PlayerService;
import com.example.player.Player;

@RestController
class PlayerController {
    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPLayers() {
        return playerService.getPLayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);

    }

    @GetMapping("/players/{playerId}")
    public Player getbyId(@PathVariable("playerId") int playerId) {
        return playerService.getbyId(playerId);

    }

    @PutMapping("/players/{playerId}")
    public Player modify(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.modify(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void delete(@PathVariable("playerId") int playerId) {
        playerService.delete(playerId);
    }

}
