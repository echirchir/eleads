package com.eleads.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private long unique_hotel_id;
    @NotNull
    private String full_name;
    @NotNull
    private String email_address;
    @NotNull
    private String phone_number;
    @NotNull
    private String address_one;
    @NotNull
    private String address_two;
    @NotNull
    private String postal_code;
    @NotNull
    private String mode_of_payment;

    private String custom_one;
    private String custom_two;
    private String custom_three;
    private String custom_four;

    public Customer() {
    }

    public Customer(long unique_hotel_id, String full_name, String email_address,String phone_number, String address_one, String address_two,
            String postal_code, String mode_of_payment, String custom_one, String custom_two,
            String custom_three, String custom_four) {
        this.unique_hotel_id = unique_hotel_id;
        this.full_name = full_name;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.address_one = address_one;
        this.address_two = address_two;
        this.postal_code = postal_code;
        this.mode_of_payment = mode_of_payment;
        this.custom_one = custom_one;
        this.custom_two = custom_two;
        this.custom_three = custom_three;
        this.custom_four = custom_four;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUnique_hotel_id() {
        return unique_hotel_id;
    }

    public void setUnique_hotel_id(long unique_hotel_id) {
        this.unique_hotel_id = unique_hotel_id;
    }

    
    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress_one() {
        return address_one;
    }

    public void setAddress_one(String address_one) {
        this.address_one = address_one;
    }

    public String getAddress_two() {
        return address_two;
    }

    public void setAddress_two(String address_two) {
        this.address_two = address_two;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getMode_of_payment() {
        return mode_of_payment;
    }

    public void setMode_of_payment(String mode_of_payment) {
        this.mode_of_payment = mode_of_payment;
    }

    public String getCustom_one() {
        return custom_one;
    }

    public void setCustom_one(String custom_one) {
        this.custom_one = custom_one;
    }

    public String getCustom_two() {
        return custom_two;
    }

    public void setCustom_two(String custom_two) {
        this.custom_two = custom_two;
    }

    public String getCustom_three() {
        return custom_three;
    }

    public void setCustom_three(String custom_three) {
        this.custom_three = custom_three;
    }

    public String getCustom_four() {
        return custom_four;
    }

    public void setCustom_four(String custom_four) {
        this.custom_four = custom_four;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }


}