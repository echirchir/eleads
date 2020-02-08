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
    private int id;

    @NotNull
    private String room_name;

    @NotNull
    private String room_type;

    @NotNull
    private int number_of_beds;

    public Room(String room_name, String room_type, int number_of_beds) {
        this.room_name = room_name;
        this.room_type = room_type;
        this.number_of_beds = number_of_beds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getNumber_of_beds() {
        return number_of_beds;
    }

    public void setNumber_of_beds(int number_of_beds) {
        this.number_of_beds = number_of_beds;
    }

}