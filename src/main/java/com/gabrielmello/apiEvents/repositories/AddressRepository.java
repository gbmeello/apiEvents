package com.gabrielmello.apiEvents.repositories;

import com.gabrielmello.apiEvents.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
