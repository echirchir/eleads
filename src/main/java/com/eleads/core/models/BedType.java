package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class BedType{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String type;

    @CreatedDate
    private DateTime created_date;

    public BedType(String type) {
        this.type = type;
    }

    public BedType(){}

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

    public DateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(DateTime created_date) {
        this.created_date = created_date;
    }

}