package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public long coutAllProducts(){
        return productRepository.count();
    }

    public List<Product> getProductByProductType(Long id){
        return productRepository.findByProductTypeId(id);
    }

    public Optional<Product> getById(Long id){
        return productRepository.findById(id);
    }

}
