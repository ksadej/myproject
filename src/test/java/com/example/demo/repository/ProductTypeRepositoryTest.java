package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.ProductType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductTypeRepositoryTest {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Test
    public void addProductType(){

        ProductType productType = new ProductType();
      // List<String> productTypeList = List.of("Nabiał","Pieczywo","Owoce","Warzywa");

        productType.setType("Nabiał");

        productTypeRepository.save(productType);

    }
}