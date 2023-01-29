package com.example.menu.repository;

import com.example.menu.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface CategoryRepository.
 *
 * @author faheem
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
