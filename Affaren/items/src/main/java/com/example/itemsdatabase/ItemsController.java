package com.example.itemsdatabase;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ItemsController {

    private final ItemsRepository repo;
    private static final Logger log = LoggerFactory.getLogger(ItemsController.class);


    ItemsController(ItemsRepository repo){
        this.repo = repo;

    }
    //Lista alla varor
    @RequestMapping("items")
    public List<Items> getAllItems(){
        log.info("All items listed");
        return repo.findAll();

    }
    //hitta specifika varor
    @RequestMapping("items/{id}")
    public Items getById(@PathVariable long id){
        log.info(("Item found with id "+id));
        return repo.findById(id).get();

    }

    @RequestMapping("items/add")
    public List<Items> addItem(@RequestParam String name, @RequestParam String pris){
        repo.save(new Items(name, pris));
        log.info("Item added");
        return repo.findAll();

    }

}
