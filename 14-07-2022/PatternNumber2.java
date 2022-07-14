/*print the pattern:
54321
5432
543
54
1
*/

package basicprogram;

import java.util.Scanner;

public class PatternNumber2 {

	public static void main(String[] args) {
		int i,j;
		System.out.println("enter rows: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}