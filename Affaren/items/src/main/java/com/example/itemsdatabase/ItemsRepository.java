package com.example.itemsdatabase;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Items, Long> {

    public List<Items> findItemsByName(String vara);
}
