package com.example.customer;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


    public interface CustomerRepository extends JpaRepository<Customer, Long> {

        public List<Customer> findCustByName(String name);


    }

