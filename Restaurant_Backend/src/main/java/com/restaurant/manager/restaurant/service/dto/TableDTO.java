package com.restaurant.manager.restaurant.service.dto;

import java.io.Serializable;

public class TableDTO implements Serializable{
    private static final long serialVersionUID = -2832800658180696417L;

    private Long id;

    private int people_quantity;

    private Boolean status;

    private Long customer_id;

    private String customer_name;

    private String customer_phone;

    private int position;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public TableDTO() {
        super();
    }


    public TableDTO(Long id, int people_quantity, Boolean status, Long customer_id, String customer_name, String customer_phone, int position) {
        this.id = id;
        this.people_quantity = people_quantity;
        this.status = status;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_phone = customer_phone;
        this.position = position;
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
     * @return String return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name the customer_name to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * @return String return the customer_phone
     */
    public String getCustomer_phone() {
        return customer_phone;
    }

    /**
     * @param customer_phone the customer_phone to set
     */
    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
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


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", people_quantity='" + getPeople_quantity() + "'" +
            ", status='" + isStatus() + "'" +
            ", customer_id='" + getCustomer_id() + "'" +
            ", customer_name='" + getCustomer_name() + "'" +
            ", customer_phone='" + getCustomer_phone() + "'" +
            ", position='" + getPosition() + "'" +
            "}";
    }

}
