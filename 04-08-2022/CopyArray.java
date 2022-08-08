/*
 *wap to copy all elements from an array to another array
 */

package arrayexamples;

import java.util.Scanner;

public class CopyArray {    
    public static void main(String[] args) {        
        //Initialize array     
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		
		//instantiate array
		int arr1[]=new int[size];
		
		//initialize array
		System.out.println("enter "+size+" elements in an array");
		for(int i=0;i<size;i++)
		  {
			arr1[i]=sc.nextInt();
		  }     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[size];    
        
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }  
        //Successful Message for copying Elements
        System.out.println("Successfully Copied");
        
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
} 