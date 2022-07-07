//1.write a program to to check if th number is divisible by 5 and 11 or not.

package basicprogram;
import java.util.Scanner;
public class DivByFiveOrEleven {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n%5 == 0) && (n%11 == 0))
			System.out.println("Number is divisible by 5 and 11");
		else
			System.out.println("Number is not divisible by 5 and 11");
	}

}
