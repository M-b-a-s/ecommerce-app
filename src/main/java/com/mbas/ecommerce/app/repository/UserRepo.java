package com.mbas.ecommerce.app.repository;

import com.mbas.ecommerce.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
