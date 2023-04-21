package org.orcle.domain;

public class Restautrant {
	private String dishname;
	private float price;
	public void Restaurant(String dishname, float price) 
	{
		this.dishname=dishname;
		this.price=price;
	}
    public void Restautrant() 
    {
		
	}
	
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Restautrant() {
		
	}
	
@Override
public String toString()
{

	return String.format ("%-20s%10.2f" ,this.dishname ,this.price); 
	
}

}
