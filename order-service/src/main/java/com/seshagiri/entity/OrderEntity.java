package com.seshagiri.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "OrderEntity" )
public class OrderEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "productName")
    private String productName;
    @Column(name = "productCost")
    private double productCost;
    @Column(name = "billingAddress")
    private String billingAddress;

    public OrderEntity(Integer id,String name, String productName, double productCost, String billingAddress) {
        this.id = id;
        this.name = name;
        this.productName = productName;
        this.productCost = productCost;
        this.billingAddress = billingAddress;
    }

    public OrderEntity(){}

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
}
