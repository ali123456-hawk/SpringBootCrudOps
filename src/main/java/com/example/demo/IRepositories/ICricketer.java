package com.example.demo.IRepositories;

import java.util.List;

import com.example.demo.model.Cricketer;

public interface ICricketer {
    void storeCricketers(List<Cricketer> cricketers);
    List<Cricketer> displayCricketers();
    
}
