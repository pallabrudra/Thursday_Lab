/*write a program to calculate gross salary of an employee. Basic salary should be taken from user.
If basic salary is greater than 1500 ,HRA=20% and DA=90% will be given else HRA=500 and DA 70% given to the employee.*/

package basicprogram;
import java.util.Scanner;

public class GrossSalaryCalculate {

	public static void main(String[] args) {
		System.out.print("Enter Basic Salary: ");
		Scanner sc = new Scanner(System.in);
		double basic = sc.nextDouble();
		
		if(basic>1500) {
			double hra = (basic*0.2);
			double da = (basic*0.9);
			double gross = basic + hra + da;
			System.out.println("Your Gross Salary is = "+gross);
		}
		else {
			double hra = 500;
			double da = (basic*0.7);
			double gross = basic + hra + da;
			System.out.println("Your Gross Salary is = "+gross);
		}
	}

}
