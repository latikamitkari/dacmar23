package org.orcle.domain;
import java.util.Scanner;


public class Restaurtantmenu {
	int index;
	private static Scanner sc= new Scanner(System.in);
	Restautrant[] arr = new Restautrant[10];
	
	public void getarray()
		{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Restautrant();
		}
	}
	public void addDish() 
	{
		if(index<arr.length) 
		{
	    	System.out.println("Enter the dish name :");
	    	sc.nextLine();
	    	arr[index].setDishname(sc.nextLine());
	    	System.out.println("Enter the price :");
	    	arr[index].setPrice(sc.nextFloat());
	    	index+=1;
		}
		else
			System.out.println("Exceed the length :");
	}    	
	public void removeDish() 
	{
		int i;
		System.out.println("Enter the dishname :");
		String s=  sc.nextLine();
		for(i=0;i<arr.length;i++) 
		{
			if(arr[i].getDishname()==s) 
			{
				arr [i]=null;
			
				
				break;
			}
		}

	} 
	public void modifyPrice() 
	{
		int i;
		System.out.println("Enter the dishname :");
		String s=  sc.nextLine();
		for(i=0;i<arr.length;i++) 
		{
			if(arr[i].getDishname()==s) 
			{
				arr[i].setPrice(0.0f);
				System.out.println("Enter the dishprice :");
				arr[i].setPrice(sc.nextFloat());
				break;
			}
		}
		
		
	} 
	public void viewMenu() 
	{
		for(int i=0;i<arr.length;i++) 
		{
			
			System.out.println(arr[i].toString());
		}
	}
		
	public  static String menuList() 
	{
		System.out.println("1.addDish:");
		System.out.println("2.removeDish :");
		System.out.println("3.modifyPrice :");
		System.out.println("4.viewMenu :");
		System.out.println("Enter the choice");
		return sc.nextLine();
	
	}
	

}

