/*
 wap to merger two array in to another array.
 */
package arrayexamples;
import java.util.Scanner;

public class MergeTwoArray {
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
		
	  //initialize array 2
	  System.out.println("enter "+size+" elements in an array 2: ");
	  for(int i=0;i<size1;i++)
	  {
		  arr2[i]=sc.nextInt();
	  }     

    //Calculating sum of length of two arrays
    int len = arr1.length + arr2.length;

    System.out.println("First Array is: ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(" " + arr1[i]);
    }
    System.out.println(" ");

    System.out.println("Second Array is: ");
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(" " + arr2[i]);
    }

    //Creating a resulting array of the calculated length
    int result[] = new int[len];
    int pos = 0;

    //for each loop to add array1 elements to the resulting array
    for (int element: arr1) {
      result[pos] = element;
      pos++;
    }

    //for each loop to add array2 elements to the resulting array
    for (int element: arr2) {
      result[pos] = element;
      pos++;
    }

    System.out.println("\nThe resulting array after merging two arrays is: ");
    for (int ele: result) {
       System.out.print(ele+" ");
      }
  }
}
