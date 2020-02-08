package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RoomType{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String type; //single, double, twin, tripple

    @NotNull
    private long room_id; //foreign key to room

    @NotNull
    private long meal_plan_id; //foreign key to meal plans

    @NotNull
    private int number_of_beds; //1, 2, 3, 4, 5

    @NotNull
    private long bed_size_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public long getMeal_plan_id() {
        return meal_plan_id;
    }

    public void setMeal_plan_id(long meal_plan_id) {
        this.meal_plan_id = meal_plan_id;
    }

    public int getNumber_of_beds() {
        return number_of_beds;
    }

    public void setNumber_of_beds(int number_of_beds) {
        this.number_of_beds = number_of_beds;
    }

    public long getBed_size_id() {
        return bed_size_id;
    }

    public void setBed_size_id(long bed_size_id) {
        this.bed_size_id = bed_size_id;
    }

}