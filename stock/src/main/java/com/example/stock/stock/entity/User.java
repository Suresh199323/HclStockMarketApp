package com.example.stock.stock.entity;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User  {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    @Access(AccessType.FIELD)
    private Integer id;

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    @Column
    @Access(AccessType.FIELD)

    private  String name;

    @Column
    @Access(AccessType.FIELD)
    private String address;

    @Column
    @Access(AccessType.FIELD)
    private Double phone;


}
