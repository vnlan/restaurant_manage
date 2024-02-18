package com.restaurant.manager.restaurant.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="mn_order")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Order implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_ORDER_SEQ")
    @SequenceGenerator(name = "MN_ORDER_SEQ", sequenceName = "MN_ORDER_SEQ", allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "status", nullable = false, unique = true)
    private int status;

    @NotNull
    @Column(name = "customer_id", nullable = false, unique = true)
    private Long customer_id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "description")
    private String description;

    @Column(name = "chef_id")
    private Long chef_id;

    public Order() {
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
     * @return int return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return Long return the customer_id
     */
    public Long getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return Date return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Long return the chef_id
     */
    public Long getChef_id() {
        return chef_id;
    }

    /**
     * @param chef_id the chef_id to set
     */
    public void setChef_id(Long chef_id) {
        this.chef_id = chef_id;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", status='" + getStatus() + "'" +
            ", customer_id='" + getCustomer_id() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", description='" + getDescription() + "'" +
            ", chef_id='" + getChef_id() + "'" +
            "}";
    }
}
