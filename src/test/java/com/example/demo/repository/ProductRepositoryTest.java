package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.ProductType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void saveProduct(){

        ProductType productType = new ProductType();
        productType.setType("Pieczywo");

        Product product = new Product();
        product.setCompany("Company name 23");
        product.setPrice(433);
        product.setName("Name nr 1123");
        product.setProductType(productType);

        productRepository.save(product);
    }

    @Test
    public void getProductByProductTypeId(){
        List<Product> num = productRepository.findByProductTypeId(37L);
        System.out.println(num);
    }
}