package twentyfive2022;
//Write a program to find out total how many palindrome word is there in a string
import java.util.Scanner;

public class PalindromeStringLine {
	//method to perform count palindrom string
	static int CheckPalindrome(String str)
	{
		String revStr = "";
	    int count =0;
	    int strLength = str.length(); //calculate the string length

	    for (int i = (strLength - 1); i >=0; i--) {
	      revStr = revStr + str.charAt(i); // in reverse order collect one word and add it revStr variable 
	    }

	    if (str.toLowerCase().equals(revStr.toLowerCase())) //check reverse string with original string
	    {
	      count++;
	    }
	    return count;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter string");
	    
	    int n=0;
	    
	    String s=sc.nextLine();
	    String s1[]=s.split(" "); // split the string in word to an array using the space delimiter
	    
	    for(int i=0;i<s1.length;i++)
	    	n+=CheckPalindrome(s1[i]); //call CheckPalindrome function by passing each word of the string and also checking the count
	    System.out.println("Number of palindrome word is: "+n);
	  }
	}



