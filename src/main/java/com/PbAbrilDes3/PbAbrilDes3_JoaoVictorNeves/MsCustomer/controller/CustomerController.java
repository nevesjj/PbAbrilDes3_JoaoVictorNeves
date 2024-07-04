package com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCustomer.controller;

import com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCustomer.entity.Customer;
import com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCustomer.exception.ResourceNotFoundException;
import com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCustomer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {

        @Autowired
        private CustomerService customerService;

        @PostMapping
        public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
            Customer savedCustomer = customerService.createCustomer(customer);
            return ResponseEntity.status(201).body(savedCustomer);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
            Optional<Customer> customer = customerService.getCustomerById(id);
            return customer.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.status(404).body(null));
        }

        @PutMapping("/{id}")
        public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customerDetails) {
            try {
                Customer updatedCustomer = customerService.updateCustomer(id, customerDetails);
                return ResponseEntity.ok(updatedCustomer);
            } catch (ResourceNotFoundException e) {
                return ResponseEntity.status(404).body(null);
            }
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
            customerService.deleteCustomer(id);
            return ResponseEntity.noContent().build();
        }
    }

