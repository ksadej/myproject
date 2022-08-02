package com.example.demo.repository;

import com.example.demo.model.Koszyk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KoszykRepository extends JpaRepository<Koszyk, Long> {

    public List<Koszyk> findByName(String name);
}
