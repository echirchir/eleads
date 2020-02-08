package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class MealPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String plan;

    @CreatedDate
    private DateTime created_date;

    public MealPlan() {
    }

    public MealPlan(String plan) {
        this.plan = plan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public MealPlan(long id, String plan) {
        this.id = id;
        this.plan = plan;
    }

    public DateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(DateTime created_date) {
        this.created_date = created_date;
    }
 
}