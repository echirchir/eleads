package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class BedType{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String type;

    
}