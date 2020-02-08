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
    private long meal_plan_id; //1, 2, 3, 4, 5

    @NotNull
    private int number_of_beds; //1, 2, 3, 4, 5

    
}