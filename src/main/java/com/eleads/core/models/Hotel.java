package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String roomtype;
    private double price;

    public Hotel(int id, String roomtype, double price) {
        this.id = id;
        this.roomtype = roomtype;
        this.price = price;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hotel() {
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }
    
}