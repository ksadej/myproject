package com.example.demo.service;

import com.example.demo.model.Koszyk;
import com.example.demo.repository.KoszykRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KoszykService {

    @Autowired
    private KoszykRepository koszykRepository;

    public List<Koszyk> getAllKoszyk(){
        return koszykRepository.findAll();
    }

    public List<Koszyk> getKoszykByName(String name){
        return koszykRepository.findByName(name);
    }
}
