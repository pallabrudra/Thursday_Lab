package twentyfive2022;
//write a program to find out first and last digit of any number
import java.util.Scanner;

public class FirstLastDigit {
	    public static void main(String args[])
	    {  
	        int number;
	        Scanner sc = new Scanner(System.in);
			System.out.println("Input a number: ");
			number = sc.nextInt(); //take input from user and store the value in the variable 
	        int firstDigit = 0; // declare a variable firstDigit and initialize it with 0
	        int lastDigit = 0; //declare a variable LastDigit and initialize it with 0
	 
	        lastDigit = number%10; //find the last digit
	        System.out.println("Last digit: "+lastDigit);
	 
	        while(number!=0) {
	            firstDigit = number%10;
	            number /= 10;
	        }
	        System.out.println("First digit: "+firstDigit);
	    }
	}
	 

