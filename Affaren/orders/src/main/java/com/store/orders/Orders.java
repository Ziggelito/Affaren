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
    protected String customerId;
    protected String itemId;


    public Orders(String date, String customerId, String itemId) {
        this.date = date;
        this.customerId = customerId;
        this.itemId = itemId;
    }
}
