package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int cid;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Address> address;

    public Customer(int id, String name, List<Address> address) {
        this.cid = id;
        this.name = name;
        this.address = address;
    }

    public Customer() {
    }

    public int getId() {
        return cid;
    }

    public void setId(int id) {
        this.cid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}