package com.example.demo.repository;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.service.CartService;
import com.example.demo.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CartRepositoryTest {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void saveCart(){
        Cart cart = new Cart();

        cart.setCreateDate(new Date());
        cart.setQuantity(1);
        cartRepository.save(cart);
    }

    @Test
    public void getByProductId(){

        System.out.println(cartRepository.findByProductId(36L));
    }
}