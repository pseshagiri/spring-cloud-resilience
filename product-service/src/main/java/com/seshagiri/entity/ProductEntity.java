package com.seshagiri.entity;



import jakarta.persistence.*;

@Entity()
@Table(name = "product")
public class ProductEntity {
  
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productid")
	private Integer productId;
	@Column(name = "productname")
	private String productName;
	@Column(name = "producttype")
	private String productType;
	@Column(name = "price")
	private double price;
	
	public ProductEntity() {}
	
	public ProductEntity(Integer productId, String productName, String productType, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
