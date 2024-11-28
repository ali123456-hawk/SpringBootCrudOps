package com.example.demo.IRepositories;

import java.util.Map;

import com.example.demo.model.FootballPlayer;

public interface IFootballPlayer {
    void storeFootballPlayers(Map<String, FootballPlayer> footballPlayers);
    Map<String, FootballPlayer> displayFootballPlayers();
    void addFootballPlayer(String key, FootballPlayer footballPlayer);
    void updateFootballPlayer(String key, FootballPlayer footballPlayer);
    void deleteFootballPlayer(String key);
    FootballPlayer getFootballPlayerByKey(String key);
}
