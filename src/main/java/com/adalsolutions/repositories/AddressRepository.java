package com.adalsolutions.repositories;

import com.adalsolutions.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    boolean existsById(int id);
}
