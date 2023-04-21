package org.orcle.main;

import org.orcle.domain.Restaurtantmenu;

public class program
{

	public static void main(String[] args) 
	{
		Restaurtantmenu rs = new Restaurtantmenu();
		rs.getarray();
		int choice;
		while ((choice = Restaurtantmenu.menuList())!=0)
		{
			switch(choice)
			{
				case 1:rs.addDish();
					break;
				case 2:rs.removeDish();
					break;
				case 3:rs.modifyPrice();
					break;
				case 4:rs.viewMenu();
					break;
			}
		
	    }
	}
}



