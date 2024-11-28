package com.example.demo.controller;

import com.example.demo.Repositories.RepoFootballPlayer;
import com.example.demo.model.FootballPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/football-players")
public class FootballPlayerController {

    @Autowired
    private RepoFootballPlayer repository;  // Autowiring the RepoFootballPlayer bean

    // Endpoint to add a new football player
    @PostMapping("/add")
    public String addFootballPlayer(@RequestParam String key, @RequestBody FootballPlayer footballPlayer) {
        repository.addFootballPlayer(key, footballPlayer);
        return "Football player added successfully!";
    }

    // Endpoint to retrieve all football players
    @GetMapping("/all")
    public Map<String, FootballPlayer> getAllFootballPlayers() {
        return repository.displayFootballPlayers();
    }

    // Endpoint to retrieve a specific football player
    @GetMapping("/{key}")
    public FootballPlayer getFootballPlayerByKey(@PathVariable String key) {
        FootballPlayer player = repository.getFootballPlayerByKey(key);
        if (player == null) {
            throw new RuntimeException("Football player not found");
        }
        return player;
    }

    // Endpoint to update a football player's details
    @PutMapping("/update/{key}")
    public String updateFootballPlayer(@PathVariable String key, @RequestBody FootballPlayer footballPlayer) {
        repository.updateFootballPlayer(key, footballPlayer);
        return "Football player updated successfully!";
    }

    // Endpoint to delete a football player
    @DeleteMapping("/delete/{key}")
    public String deleteFootballPlayer(@PathVariable String key) {
        repository.deleteFootballPlayer(key);
        return "Football player deleted successfully!";
    }
}
