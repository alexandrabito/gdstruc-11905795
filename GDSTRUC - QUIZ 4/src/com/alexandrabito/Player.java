package com.alexandrabito;

import java.util.Objects;

public class Player {
    private int playerId;
    private String userName;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.alexandrabito.Player player = (com.alexandrabito.Player) o;
        return playerId == player.playerId
                && level == player.level &&
                Objects.equals(userName, player.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, userName, level);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", userName='" + userName + '\'' +
                ", level=" + level +
                '}';
    }

    public Player(int playerId, String userName, int level) {
        this.playerId = playerId;
        this.userName = userName;
        this.level = level;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int id) {
        this.playerId = playerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}