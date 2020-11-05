package com.wipro.shopbill.entity;

public class Item {
private String itemName;
private double price;
private String itemType;
private String company;
private String placeOfManufacture;

public Item(String itemName, double price, String itemType, String company, String placeOfManufacture) {
	super();
	this.itemName = itemName;
	this.price = price;
	this.itemType = itemType;
	this.company = company;
	this.placeOfManufacture = placeOfManufacture;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getItemType() {
	return itemType;
}
public void setItemType(String itemType) {
	this.itemType = itemType;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getPlaceOfManufacture() {
	return placeOfManufacture;
}
public void setPlaceOfManufacture(String placeOfManufacture) {
	this.placeOfManufacture = placeOfManufacture;
}

}
