package com.restaurant.manager.restaurant.service.dto;

import java.io.Serializable;
import java.sql.Date;

public class FoodDTO implements Serializable {
    private static final long serialVersionUID = -2832800658180696417L;

    private Long id;

    private String name;

    private String price;

    private String description;

    private Float rate;

    private String food_img;

    private Long food_vote_quantity;

    private Float food_last_vote;

    private Date created_at;

    private String created_by;

    public FoodDTO() {
    }

    public FoodDTO(Long id, String name, String price, String description, Float rate, String food_img, Long food_vote_quantity, Float food_last_vote, Date created_at, String created_by) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.rate = rate;
        this.food_img = food_img;
        this.food_vote_quantity = food_vote_quantity;
        this.food_last_vote = food_last_vote;
        this.created_at = created_at;
        this.created_by = created_by;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getFood_img() {
        return food_img;
    }

    public void setFood_img(String food_img) {
        this.food_img = food_img;
    }

    public Long getFood_vote_quantity() {
        return food_vote_quantity;
    }

    public void setFood_vote_quantity(Long food_vote_quantity) {
        this.food_vote_quantity = food_vote_quantity;
    }

    public Float getFood_last_vote() {
        return food_last_vote;
    }

    public void setFood_last_vote(Float food_last_vote) {
        this.food_last_vote = food_last_vote;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @Override
    public String toString() {
        return "Food{" +
            "id" + getId() +
            ", name='" + getName() + "'" +
            "price='" + getPrice();
    }
}

