package com.example.demo.Repositories;

import com.example.demo.IRepositories.IFootballPlayer;
import com.example.demo.model.FootballPlayer;
import org.springframework.stereotype.Repository;  // Make sure this import is present

import java.util.HashMap;
import java.util.Map;

@Repository  // This makes the class a Spring Bean
public class RepoFootballPlayer implements IFootballPlayer {

    private Map<String, FootballPlayer> footballPlayers = new HashMap<>();

    @Override
    public void storeFootballPlayers(Map<String, FootballPlayer> newFootballPlayers) {
        footballPlayers.putAll(newFootballPlayers);
    }

    @Override
    public Map<String, FootballPlayer> displayFootballPlayers() {
        return footballPlayers;
    }

    @Override
    public void addFootballPlayer(String key, FootballPlayer footballPlayer) {
        footballPlayers.put(key, footballPlayer);
    }

    @Override
    public void updateFootballPlayer(String key, FootballPlayer footballPlayer) {
        if (footballPlayers.containsKey(key)) {
            footballPlayers.put(key, footballPlayer);
        } else {
            throw new RuntimeException("Football player not found");
        }
    }

    @Override
    public void deleteFootballPlayer(String key) {
        if (footballPlayers.containsKey(key)) {
            footballPlayers.remove(key);
        } else {
            throw new RuntimeException("Football player not found");
        }
    }

    @Override
    public FootballPlayer getFootballPlayerByKey(String key) {
        return footballPlayers.get(key);
    }
}
