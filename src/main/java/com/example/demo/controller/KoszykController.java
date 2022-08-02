package com.example.demo.controller;

import com.example.demo.model.Koszyk;
import com.example.demo.service.KoszykService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/koszyk")
@CrossOrigin(origins = "http://localhost:4200")
public class KoszykController {

    @Autowired
    private KoszykService koszykService;

    @GetMapping("/allKoszyk")
    public List<Koszyk> getKoszyk(){
        return koszykService.getAllKoszyk();
    }

    @GetMapping("/{name}")
    public List<Koszyk> getKoszykByName(@PathVariable String name){
        return koszykService.getKoszykByName(name);
    }
}
