/*
 * wap to add two array elements and store it in different array
 */
package arrayexamples;

import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			//initialize two  arrays
			  System.out.println("enter the size of array1:");
			  int size=sc.nextInt();
			  
			  //instantiate array 1
			  int arr1[]=new int[size];
				
			  //initialize array 1
			  System.out.println("enter "+size+" elements in an array 1: ");
			  for(int i=0;i<size;i++)
			  {
				  arr1[i]=sc.nextInt();
			  }  
			  
			  System.out.println("enter the size of array2:");
			  int size1=sc.nextInt();
			  
			  //instantiate array 2
			  int arr2[]=new int[size1];
			   
			  //Check if two array equal or not if not then stop the program
			  if(arr1.length<arr2.length || arr1.length>arr2.length) {
				System.out.println("Addition Not Possible, Please Input Same Array Length");
				System.exit(0);
			  }
			  //initialize array 2
			  System.out.println("enter "+size1+" elements in an array 2: ");
			  for(int i=0;i<size1;i++)
			  {
				  arr2[i]=sc.nextInt();
			  }     
			  
			if(arr1.length<arr2.length || arr1.length>arr2.length) {
				System.out.println("Addition Not Possible");
				System.exit(0);
			}
			  		
			//instantiate array 3
			  int arr3[]=new int[size];
			  
			  //Calculate Sum of two array and Display
			  System.out.println("Sum of Two Array is: ");
			  for(int i=0;i<size;i++) 
			  {
				  arr3[i]= arr1[i] + arr2[i];
				  System.out.print(arr3[i]+" ");
			  }
			 

	}

}
