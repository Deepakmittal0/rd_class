package assifnment_func;

import java.util.Scanner;

public class temp_con_fun {
	
	
	
	static void printFeh(float x)
	{
		System.out.println("feh="+x);}
	
		static void printCel(float y)
		{

		System.out.println("cel="+y);
		
	}

	public static void main(String[] args) {
		
		System.out.println("enter the temp for feh to cel");
		Scanner o =new Scanner(System.in);
		int Feh=o.nextInt();
		int Cel=(Feh-32)*5/9;
		printCel(Cel);
		
		System.out.println("enter the temp for cel to feh");
		
		Cel=o.nextInt();
		
		Feh =(Cel*9/5)+32;
	   printFeh(Feh);
	
		
	}

}
