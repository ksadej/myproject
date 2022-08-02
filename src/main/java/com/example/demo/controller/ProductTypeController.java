package com.example.demo.controller;

import com.example.demo.model.ProductType;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productType")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("/all")
    public List<ProductType> getAllProductType(){
        return productTypeService.listOfPorductType();
    }
}
