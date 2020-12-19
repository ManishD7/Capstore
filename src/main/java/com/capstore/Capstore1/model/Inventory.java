package com.capstore.Capstore1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Inventory")
public class Inventory {

	@Id
	@Column(name="inventoryId")
	private int inventoryId;
	@Column(name="productName")
	private String productName;
	@Column(name="productCategory")
	private String productCategory;
	@Column(name="productPrice")
	private double productPrice;
	@Column(name="productDescription")
	private String productDescription;
	private String productBrand;

	@Column(name="status")
	private String status;
	@Column(name="inventoryType")
	private String inventoryType;
	@Column(name="inventoryQuantity")
	private int inventoryQuantity;
	
	@Column(name="imageUrl")
	private String imageUrl;
	
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public int getInventoryQuantity() {
		return inventoryQuantity;
	}
	public void setInventoryQuantity(int inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}
	
	
	public  String getImageUrl() {
		return imageUrl;
	}
	public  void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public  String toString() {
		return "Inventory [inventoryId=" + inventoryId +  ", productName=" + productName
				+ ", productCategory=" + productCategory + ", productPrice=" + productPrice + ", productDescription="
				+ productDescription + ", productBrand=" + productBrand  + " status=" + status
				+ ", inventoryType=" + inventoryType + ", inventoryQuantity=" + inventoryQuantity + ", imageUrl="
				+ imageUrl + "]";
	}
	
	public Inventory(int inventoryId, String productName, String productCategory,
			double productPrice, String productDescription, String productBrand, String status,
			String inventoryType, int inventoryQuantity, String imageUrl) {
		super();
		this.inventoryId = inventoryId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productBrand = productBrand;
		//this.promo = promo;
		this.status = status;
		this.inventoryType = inventoryType;
		this.inventoryQuantity = inventoryQuantity;
		this.imageUrl = imageUrl;
	}
	public  Inventory() {
		super();
	}
	
	
}