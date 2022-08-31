/*
 * wap to find out maximum and minimum number in array.
 */

package twentyfive2022;

import java.util.Scanner;

public class FindMinMaxArray {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		
		//instantiate array
		int arr[]=new int[size];
		
		//initialize array
		System.out.println("enter "+size+" elements in an array");
		for(int i=0;i<size;i++)
		  {
			arr[i]=sc.nextInt();
		  }
		int min = arr[0];
		int max = arr[0];
        // do for each array element
        for (int i = 1; i < arr.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (arr[i] > max) {
                max = arr[i];
            }
 
            // if the current element is smaller than the minimum found so far
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
 
        System.out.println("The Minimum element in array is: "+ min);
        System.out.println("The Maximum array element is: "+ max);

	}

}
