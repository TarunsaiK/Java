package com.wipro.shopbill.entity;

public class Cart {
private Item items[];
private int quantity[];
private int cartCapacity;
private int itemCount;
private double totalFare;
public Cart()
{
	cartCapacity=2;
	items=new Item[cartCapacity];
	quantity=new int[cartCapacity];
	totalFare=0.0;
	itemCount=0;
}
private void increaseCartCapacity()
{
	 Item tempit[]=new Item[cartCapacity];
	 int tempquan[]=new int[cartCapacity];
	 for(int i=0;i<cartCapacity;i++)
	 {
		tempit[i]= items[i];
		tempquan[i]=quantity[i];
	 }
	 cartCapacity=cartCapacity*2;
	 items=new Item[cartCapacity];
	 quantity=new int[cartCapacity];
	 for(int i=0;i<tempit.length;i++)
	 {
		 items[i]=tempit[i];
		 quantity[i]=tempquan[i];
	 }
	 
}
public void addToCart(Item item,int quantity)
{
	
	if(itemCount==cartCapacity)
		increaseCartCapacity();
	
	items[itemCount]=item;
	this.quantity[itemCount]=quantity;
	//System.out.println("item "+items[itemCount].getItemName()+" added sucessfully!!");
	itemCount++;
	
}
public double computeTotal()
{
	for(int i=0;i<itemCount;i++)
	{
		totalFare+=(items[i].getPrice()*quantity[i]);
	}
	return totalFare;
}
public void PrintDetails()
{
	System.out.println("S.No	ItemName	Price	Qty");
	double totalPrice=0.0; 
	for(int i=0;i<cartCapacity;i++)
	{
		System.out.println((i+1)+"	"+items[i].getItemName()+"	"+items[i].getPrice()+"  "+quantity[i]);
		totalPrice+=items[i].getPrice();
	}
	System.out.println("Total:RS "+totalPrice);
}
}
