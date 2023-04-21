package org.orcle.main;
import java.util.Scanner;
import java.util.Arrays;

public class Result {
   private int[] arr;
   private int sum;
  public void accceptRecord() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter size of array");
	  arr = new int[sc.nextInt()];
	  System.out.println("Enter the element");
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println("arr["+i+"]  :"+arr[i]);
	  }
	  
  }
  public void sumArray() {
	  for(int i=0;i<arr.length;i++)
      {
		  sum =sum+arr[i];
		  System.out.println("Sum :" +sum);
	  }
  }
	
  public void average() {
	  double avg = sum /arr.length;
	  System.out.println("Average :" +avg);
	  
  }
  public void sortElement() {
	  Arrays.sort(arr);
	  System.out.println("Largest Element :"+arr[arr.length-1]);
	  System.out.println("Smallest Element :" +arr[0]);
	  System.out.println("A Sorted Array :" +Arrays.toString(arr));
	  
	  
  }
}
