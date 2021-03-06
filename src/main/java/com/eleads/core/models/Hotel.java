package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Hotel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private long customer_id; //autogenerated sequence value

    @NotNull
    private String description; //description of the hotel

    @NotNull
    private String facilities; //coma separated values to split

    private String what_is_nearby; //coma separated values to split

    private String terms_and_conditions; //url - path to

    private String photo_paths; //relative paths to the images

    @CreatedDate
    private DateTime created_date;

    public Hotel(){}

    public Hotel(long customer_id, String description, String facilities, String what_is_nearby, String terms_and_conditions, String photo_paths) {
        this.customer_id = customer_id;
        this.description = description;
        this.facilities = facilities;
        this.what_is_nearby = what_is_nearby;
        this.terms_and_conditions = terms_and_conditions;
        this.photo_paths = photo_paths;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getWhat_is_nearby() {
        return what_is_nearby;
    }

    public void setWhat_is_nearby(String what_is_nearby) {
        this.what_is_nearby = what_is_nearby;
    }

    public String getTerms_and_conditions() {
        return terms_and_conditions;
    }

    public void setTerms_and_conditions(String terms_and_conditions) {
        this.terms_and_conditions = terms_and_conditions;
    }

    public String getPhoto_paths() {
        return photo_paths;
    }

    public void setPhoto_paths(String photo_paths) {
        this.photo_paths = photo_paths;
    }

    public DateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(DateTime created_date) {
        this.created_date = created_date;
    }

}