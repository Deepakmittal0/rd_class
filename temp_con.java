package assignment_1;

import java.util.Scanner;

public class temp_con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the temp for feh to cel");
		Scanner o =new Scanner(System.in);
		int feh=o.nextInt();
		int cel=(feh-32)*5/9;
		System.out.println("enter the temp for cel to feh");
//		Scanner o =new Scanner(System.in);
		cel=o.nextInt();
		feh =(cel*9/5)+32;
		System.out.println("cel="+cel);
		System.out.println("feh="+feh);
		
		
	}

}
