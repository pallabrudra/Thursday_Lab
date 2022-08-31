package twentyfive2022;
/*

 		 * 
       * * * 
     * * * * * 
   * * * * * * * 
 * * * * * * * * *
 */

import java.util.Scanner;

public class PyramidPatternStar{    
	public static void main(String args[])   
	{   	 
		int i, j, r,k;  
		Scanner sc = new Scanner(System.in);
		//take no. of rows from user
		System.out.println("Input number of rows: ");
		r = sc.nextInt();
		// logic for print star pyramid
		k=r*2-1;
		for (i=0; i<k; i+=2)   
		{        
			for (j=k-i; j>1; j--)   
			{    
				System.out.print(" ");   
			}   
			for (j=0; j<=i; j++ )   
			{       
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
}   
}  