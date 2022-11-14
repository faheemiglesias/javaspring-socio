package com.example.menu.repository;

import java.util.Optional;

import com.example.menu.model.ERole;
import com.example.menu.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
