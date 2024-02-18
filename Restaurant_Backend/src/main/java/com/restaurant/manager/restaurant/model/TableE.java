package com.restaurant.manager.restaurant.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
// import java.util.HashSet;
// import java.util.Set;

@Entity
@Table(name = "mn_table")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TableE implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_TABLE_SEQ")
    @SequenceGenerator(name = "MN_TABLE_SEQ", sequenceName = "MN_TABLE_SEQ", allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "status", nullable = false, unique = true)
    private Boolean status;

    @NotNull
    @Column(name = "position", nullable = false, unique = true)
    private int position;

    @Column(name = "people_quantity")
    private int people_quantity;

    @ManyToOne
    @JsonIgnoreProperties(value = "table", allowSetters = true)
    private Customer customer;

    public TableE() {
        super();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return int return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * @return int return the people_quantity
     */
    public int getPeople_quantity() {
        return people_quantity;
    }

    /**
     * @param people_quantity the people_quantity to set
     */
    public void setPeople_quantity(int people_quantity) {
        this.people_quantity = people_quantity;
    }

    /**
     * @return Customer return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    /**
     * @return Boolean return the status
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", status='" + isStatus() + "'" +
            ", position='" + getPosition() + "'" +
            ", people_quantity='" + getPeople_quantity() + "'" +
            ", customer='" + getCustomer() + "'" +
            "}";
    }

}
