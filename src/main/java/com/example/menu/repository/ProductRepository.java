package com.example.menu.repository;

import com.example.menu.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface ProductRepository.
 *
 * @author faheem
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}