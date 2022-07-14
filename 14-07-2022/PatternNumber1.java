/* print this pattern:
1
12
123
1234
12345
*/

package basicprogram;

import java.util.Scanner;

public class PatternNumber1 {

	public static void main(String[] args) {
		int i,j;
		System.out.print("enter rows: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}