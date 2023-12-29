// Write your code here.
package com.example.player;

class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    Player(int playerId, String playerName, int jerseyNumber, String role) {
        playerId = playerId;
        playerName = playerName;
        jerseyNumber = jerseyNumber;
        role = role;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getplayerName() {
        return playerName;
    }

    public void setjerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getjerseyNumber() {
        return jerseyNumber;
    }

    public void setrole(String role) {
        this.role = role;
    }

    public String getrole() {
        return role;
    }

}
