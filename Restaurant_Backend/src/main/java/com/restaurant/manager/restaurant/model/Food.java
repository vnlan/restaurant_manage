package com.restaurant.manager.restaurant.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="mn_food")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Food implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTO_INCREMENT_SEQUENCE_2")
    @SequenceGenerator(name = "AUTO_INCREMENT_SEQUENCE_2", sequenceName = "AUTO_INCREMENT_SEQUENCE_2", allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @NotNull
    @Column(name = "price", nullable = false, unique = true)
    private String price;

    @Column(name = "description")
    private String description;

    @Column(name = "rate")
    private Float rate;

    @Column(name = "food_img")
    private String food_img;

    @Column(name = "food_vote_quantity")
    private Long food_vote_quantity;

    @Column(name = "food_last_vote")
    private Float food_last_vote;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "created_by")
    private String created_by;

    public Food() {
        super();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

