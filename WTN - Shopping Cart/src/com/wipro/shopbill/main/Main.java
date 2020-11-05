package com.wipro.shopbill.main;
import com.wipro.shopbill.entity.*;
import com.wipro.shopbill.service.*;
public class Main {
	static Item[] items=new Item[3];
	static int quantity[]=new int[3];
	Main()
	{
		
		items[0]=new Item("Lenovo",30000,"Laptop","Lenovo","China");
		items[1]=new Item("Macbook Air",100000,"Laptop","Apple","USA");
		items[2]=new Item("Lenovo",30000,"Laptop","Lenovo","India");
		quantity[0]=1;
		quantity[1]=1;
		quantity[2]=1;
}
	public static void main(String[] atg)
	{
		new Main();
		BillService b=new BillService();
		System.out.println(b.shop(items, quantity));
		
		
	}
}
