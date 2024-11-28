package com.example.demo.Repositories;

import com.example.demo.IRepositories.ICricketer;
import com.example.demo.model.Cricketer;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository  // Add this annotation to make it a Spring-managed bean
public class RepoCricketer implements ICricketer {
    private List<Cricketer> cricketers = new ArrayList<>();

    @Override
    public void storeCricketers(List<Cricketer> newCricketers) {
        cricketers.addAll(newCricketers);
    }

    public void addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
    }

    @Override
    public List<Cricketer> displayCricketers() {
        return cricketers;
    }
}
