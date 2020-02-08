package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import io.micrometer.core.lang.NonNull;

@Entity
public class HotelMeta{

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private long customer_id;

    @NotNull
    private String description;

    @NotNull
    private String facilities;

    private String what_is_nearby;

    private String terms_and_conditions;

    private String photo_paths;

    public HotelMeta(){}

    public HotelMeta(long customer_id, String description, String facilities, String what_is_nearby,
            String terms_and_conditions, String photo_paths) {
        this.customer_id = customer_id;
        this.description = description;
        this.facilities = facilities;
        this.what_is_nearby = what_is_nearby;
        this.terms_and_conditions = terms_and_conditions;
        this.photo_paths = photo_paths;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}