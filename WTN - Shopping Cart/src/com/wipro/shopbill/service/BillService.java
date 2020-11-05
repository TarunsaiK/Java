package com.wipro.shopbill.service;
import com.wipro.shopbill.entity.*;
import com.wipro.shopbill.exception.*;
public class BillService {
	
	public boolean validate(Item item,int quantity)throws InvalidItemException,InvalidQuantityException
	{
		if(item==null||item.getItemName().length()<5||!(item.getPrice()>=5000.0&&item.getPrice()<=500000.0)||!(item.getItemType().equals("Laptop")||item.getItemType().equals("Mobile")||item.getItemType().equals("Accessories"))||!(item.getPlaceOfManufacture().equals("India")||item.getPlaceOfManufacture().equals("USA")||item.getPlaceOfManufacture().equals("China")))
			throw new InvalidItemException();
		else if(quantity <1 || quantity>5)
			throw new InvalidQuantityException();
		else
			return true;
				
	}
	public double shop(Item items[],int quantity[])
	{
		Cart cart=new Cart();
		for(int i=0;i<items.length;i++)
		{
			try {
				if(validate(items[i],quantity[i]))
					cart.addToCart(items[i], quantity[i]);
			}
			catch(InvalidItemException e)
			{
				return -1;
			}
			catch(InvalidQuantityException e)
			{
				return -2;
			}
		}
		return cart.computeTotal();
	}
}
