package assifnment_func;
import java.util.Scanner;

public class vowel_cons_func {
	
	static void printVowel( char vowel) {
		System.out.println("vowel");
	}
	static void printConsonant(char conso) {
		System.out.println("consonant");
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
			printVowel(ch);
		}else {
				printConsonant(ch);
			}
			
		
		

	}

}
