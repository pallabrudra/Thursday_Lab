package twentyfive2022;
//print reverse of an array
import java.util.Scanner;

public class ReverseArray {  
    public static void main(String[] args) {  
        //Initialize array
    	Scanner sc = new Scanner(System.in);
		System.out.println("Input number of elements: ");
		int n = sc.nextInt();
        int [] arr = new int [n]; 
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) 
		      arr[i] = sc.nextInt();
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  