package com.restaurant.manager.restaurant.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
//import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
@Entity
@Table(name="mn_chef")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Chef implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_CHEF_SEQ1")
    @SequenceGenerator(name = "MN_CHEF_SEQ1", sequenceName = "MN_CHEF_SEQ1", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private int sex;

    @Column(name ="DATEOFBIRTH")
    private Date dateofbirth;

    @Column(name = "WORKINGYEARS")
    private int workingyears;

    @Column(name = "DATESTARTWORKING")
    private Date datestartworking;

    @Column(name = "SALARY")
    private int salary;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DESCRIPTION")
    private String description;

    public Chef() {
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

    /**
     * @return int return the sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(int sex) {
        this.sex = sex;
    }


    /**
     * @return Date return the dateofbirth
     */
    public Date getDateofbirth() {
        return dateofbirth;
    }

    /**
     * @param dateofbirth the dateofbirth to set
     */
    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    /**
     * @return Date return the workingyears
     */
    public int getWorkingyears() {
        return workingyears;
    }

    /**
     * @param workingyears the workingyears to set
     */
    public void setWorkingyears(int workingyears) {
        this.workingyears = workingyears;
    }

    /**
     * @return int return the salary
     */
    public int getSalary() {
        return salary;
    }

    public Date getDatestartworking() {
        return datestartworking;
    }

    public void setDatestartworking(Date datestartworking) {
        this.datestartworking = datestartworking;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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

}