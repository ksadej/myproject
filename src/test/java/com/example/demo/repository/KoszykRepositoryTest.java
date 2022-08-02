package com.example.demo.repository;

import com.example.demo.model.Koszyk;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KoszykRepositoryTest {

    @Autowired
    private KoszykRepository koszykRepository;

    @Test
    public void printAllproducts(){
        List<Koszyk> koszyk = koszykRepository.findAll();
        System.out.println(koszyk);
    }

    @Test
    public void printKoszykByName(){
        List<Koszyk> koszyk = koszykRepository.findByName("Koszyk nr 1");
        System.out.println(koszyk);
    }
}