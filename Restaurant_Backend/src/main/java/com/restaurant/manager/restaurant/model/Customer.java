package com.restaurant.manager.restaurant.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mn_customer")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_CUSTOMER_SEQ")
    @SequenceGenerator(name = "MN_CUSTOMER_SEQ", sequenceName = "MN_CUSTOMER_SEQ", allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "phone_number", nullable = false, unique = true)
    private String phone_number;

    @Column(name = "name")
    private String name;

    @Column(name = "login_name")
    private String login_name;

    @OneToMany(mappedBy = "customer")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = "customer", allowSetters = true)
    private Set<TableE> table = new HashSet<>();

    public Customer() {
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
     * @return String return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", phone_number='" + getPhone_number() + "'" + ", name='" + getName()
                + "'" + "}";
    }

    /**
     * @return Set<TableE> return the table
     */
    public Set<TableE> getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(Set<TableE> table) {
        this.table = table;
    }

    /**
     * @return String return the login_name
     */
    public String getLogin_name() {
        return login_name;
    }

    /**
     * @param login_name the login_name to set
     */
    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

}
