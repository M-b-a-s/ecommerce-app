package com.mbas.ecommerce.app.repository;

import com.mbas.ecommerce.app.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
