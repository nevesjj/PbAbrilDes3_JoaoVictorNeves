package com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCustomer.repository;


import com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCustomer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}