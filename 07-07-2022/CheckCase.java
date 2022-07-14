//4.wap to check whether a character is uppercase or lowercase.
package basicprogram;

public class CheckCase {

	public static void main(String[] args) {
		char c= 'F';
		if(c>='a' && c<='z')
			System.out.println(c+" is in Lowercase");
		else if(c>='A' && c<='Z' )
			System.out.println(c+" is in Uppercase");
		else
			System.out.println("Error");

	}

}
