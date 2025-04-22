package com.ems.employeemanagement.ems;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmailRepository extends JpaRepository<Email, Long> {
    Optional<Email> findByAddress(String address);
    boolean existsByAddress(String address);
}
