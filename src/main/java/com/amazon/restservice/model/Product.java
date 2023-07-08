package com.amazon.restservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Document("Product")
public class Product {

    @Id
    public String id;
    public String name;
    public String url;
    public List<Integer>prices;
    public List<String>usersTracking;

    public Product(String name, String url, Integer price,String userTracking) {
        this.name = name;
        this.url = url;
        this.prices = new ArrayList<Integer>();
        this.prices.add(price);
        this.usersTracking = new ArrayList<String>();
        this.usersTracking.add(userTracking);



    }
}
