package assifnment_func;

import java.util.Scanner;

public class simple_interest {
	
	
	static void printInterest(double interest)
	{
	System.out.println("this is interest"+interest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the principal");
		Scanner sc= new Scanner(System.in);
		int prin =sc.nextInt();
		
		System.out.println("enter the rate");
		int rate=sc.nextInt();
		
		System.out.println("enter the time");
		int time=sc.nextInt();
		double x = (prin*rate*time)/100;
		printInterest(x);

		
		

		
		
		
		


	}


}
