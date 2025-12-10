package com.mbas.ecommerce.app.repository;

import com.mbas.ecommerce.app.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review, Long> {
}
