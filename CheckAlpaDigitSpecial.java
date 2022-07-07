//3.wap to input any character and check whether its alphabet,digit or special character.

package basicprogram;
import java.util.Scanner;
public class CheckAlpaDigitSpecial {
	public static void main(String[] args) {
		
				char ch;
				System.out.println("Enter a Character");
				Scanner sc = new Scanner(System.in);
				ch = sc.next().charAt(0);
		        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		        	System.out.println(ch + " is A ALPHABET.");
		        else if(ch >= '0' && ch <= '9') 
		            System.out.println(ch + " is A DIGIT.");
		        else
		        	System.out.println(ch + " is A SPECIAL CHARACTER.");
	
		    }
		}
