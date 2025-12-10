package com.mbas.ecommerce.app.repository;

import com.mbas.ecommerce.app.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
