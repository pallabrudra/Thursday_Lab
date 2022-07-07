//5.wap to calculate bonus.if employee is serving  in organization for more than 3years, bonus =2500 will be given to employee.
package basicprogram;

import java.util.Scanner;
public class BonusAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joining year");
		int join_year = sc.nextInt();
		System.out.println("Enter Current year");
		int curr_year = sc.nextInt();
		
		int diff = curr_year - join_year; 
		
		if(diff>3)
			System.out.println("Bonus: 2500 Credited");
		
			

}
}
