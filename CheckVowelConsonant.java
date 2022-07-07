//2.write a program to input any alphabet and check whether its vowel or consonant.

package basicprogram;

public class CheckVowelConsonant {

	public static void main(String[] args) {
		char c= 'A';
		if(c=='a' || c == 'e' || c=='i' || c == 'o' || c=='u' || c=='A' || c == 'E' || c=='I' || c == 'O' || c=='U')
			System.out.println(c+" is Vowel");
		else
			System.out.println(c+" is a Consonant");


	}

}
