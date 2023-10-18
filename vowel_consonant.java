package assignment_1;
import java.util.Scanner;

public class vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a char");
		Scanner o =new Scanner(System.in);
		  char ch=o.next().charAt(0);
		if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' ||ch=='u' ) {
			System.out.println("vowel");
			}
		else {
			System.out.println("consonant");

		}

	}

}
