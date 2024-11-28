package com.example.demo.controller;

import com.example.demo.Repositories.RepoCricketer;
import com.example.demo.model.Cricketer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cricketers")
public class CricketerController {

    @Autowired
    private RepoCricketer repository; // Injecting the RepoCricketer dependency

    // Endpoint to add a single cricketer
    @PostMapping("/add")
    public String addCricketer(@RequestBody Cricketer cricketer) {
        repository.addCricketer(cricketer);
        return "Cricketer added successfully!";
    }

    // Endpoint to retrieve all cricketers
    @GetMapping("/all")
    public List<Cricketer> getAllCricketers() {
        return repository.displayCricketers();
    }
}
