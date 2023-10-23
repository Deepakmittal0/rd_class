package assignment_1;

import java.util.Scanner;

public class temp_convert {

	public static void main(String[] args) {
		
		System.out.println("enter the temp for feh to cel");
		Scanner o =new Scanner(System.in);
		double feh=o.nextFloat();
		double cel=((feh-32)*5)/9;
		System.out.println("cel="+cel);
		System.out.println("enter the temp for cel to feh");
		cel=o.nextFloat();
		feh =(cel*9/5)+32;
		System.out.println("feh="+feh);
		
		
	}

}
