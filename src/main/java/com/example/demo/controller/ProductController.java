package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/count")
    public long getCountOfProducts(){
        return productService.coutAllProducts();
    }

    @GetMapping("/productType/{id}")
    public List<Product> getProductsByProductID(@PathVariable("id") Long id){
        return productService.getProductByProductType(id);
    }
}
