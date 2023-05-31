package com.store.orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    //Behövs för att kunna koppla leta i ordrar och koppla de till kunder för sökfunktioner.
    /*List<Orders> findAllByCustomer_Id(Long customerId);*/
}
