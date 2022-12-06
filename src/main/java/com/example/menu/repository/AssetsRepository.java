package com.example.menu.repository;

import com.example.menu.model.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetsRepository extends JpaRepository<Assets, Long> {
    boolean existsAssetsByScientificName(String scientificName);
    List<Assets> findByScientificName(String scientificName);
}