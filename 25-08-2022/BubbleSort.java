package twentyfive2022;
/*
 * Write a program to calculate bubble sort.
 */
import java.util.Scanner;
class BubbleSort {
	public static void main(String []args) {
		int n, c, d, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of integers to sort");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " integers");
		//take the elements of an array
		for (c = 0; c < n; c++) 
		      arr[c] = sc.nextInt();
		//logic for sorting
		for (c = 0; c < ( n - 1 ); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (arr[d] > arr[d+1]) 
				 {
					//swapping
					temp = arr[d];
					arr[d]   = arr[d+1];
					arr[d+1] = temp;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		//display the sorted array
		for (c = 0; c < n; c++) 
		      System.out.print(arr[c]+" ");
	}
}
