package com.rupam.springdemo.service;

import com.rupam.springdemo.repo.LaptopRepository;
import com.rupam.springdemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("Method called");
        repo.save(lap);
    }

    public boolean isGoodforProgramming(Laptop lap){
        return true;
    }
}
