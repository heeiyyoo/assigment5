package com.javaacademy.sprinttestapp.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String product_code;
    private int quantity;
    private double priceeach;
    @ManyToOne
    Orders orders;

    public OrderDetails(Integer id, String product_code, int quantity, double priceeach) {
        this.id = id;
        this.product_code = product_code;
        this.quantity = quantity;
        this.priceeach = priceeach;
    }

    public OrderDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceeach() {
        return priceeach;
    }

    public void setPriceeach(double priceeach) {
        this.priceeach = priceeach;
    }
}