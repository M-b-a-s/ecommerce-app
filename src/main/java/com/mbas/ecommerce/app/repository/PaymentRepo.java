package com.mbas.ecommerce.app.repository;

import com.mbas.ecommerce.app.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
