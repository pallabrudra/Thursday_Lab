package twentyfive2022;
//remove duplicate elements from an array
import java.util.Scanner;

public class RemoveDuplicateElementArray {
	//bubble sort method
	static void bubbleSort(int a[],int n)
	{
		for (int c = 0; c < ( n - 1 ); c++) {
			for (int d = 0; d < n - c - 1; d++) {
				if (a[d] > a[d+1]) 
				 {
					//swapping
					int t = a[d];
					a[d]   = a[d+1];
					a[d+1] = t;
				}
			}
		}
		
	}
	//Remove duplicate elements method
	static int removeduplicates(int a[], int n)
	{
		
        if (n == 0 || n == 1) {
            return n;
        }
        
        bubbleSort(a,n); // call bubbleSort to sort the array
        
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) //check if current and next position(immediate of the current position) is duplicate or not
            {
                temp[j++] = a[i]; //store only unique elements to another array
            }
        }
 
        temp[j++] = a[n - 1];

        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input number of elements: ");
		int num = sc.nextInt();
		int a[] = new int[num]; //create an array by using given array size
		
		System.out.println("Enter Elements: ");
        for (int i = 0; i < num; i++) 
		      a[i] = sc.nextInt(); //take value to the array from user
        int n = a.length; //calculate length of the array
 
       int m= removeduplicates(a, n); //call the removeduplicates function, it will return no. of duplicate elements in the array
       
        System.out.println("Actual array is: ");
        for (int i = 0; i < m; i++)
            System.out.print(a[i] + " ");

	}

}
