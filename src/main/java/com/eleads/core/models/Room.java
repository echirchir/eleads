package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Room{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name; //DELUXE, STANDARD, SUPERIOR, PRESIDENTIAL, 

    @NotNull
    private long hotel_id;

    public Room(){
    }

    public Room(String name, long hotel_id) {
        this.name = name;
        this.hotel_id = hotel_id;
    }

    public Room(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}