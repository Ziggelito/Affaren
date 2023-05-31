package com.store.orders;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity


public class Orders {

    @Id
    @GeneratedValue
    protected long id;
    protected String date;
    /*@ManyToOne
    @JoinColumn
    private Customer customer;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<Item> items = new ArrayList<>();

    public Orders(String date, Customer customer){
        this.date = date;
        this.customer = customer;
    }
    public void addItems(Item item) {
        items.add(item);
    }*/
}
