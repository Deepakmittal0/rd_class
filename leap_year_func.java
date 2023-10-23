package assifnment_func;

import java.util.Scanner;

public class leap_year_func {

	
	static void printLeap(int leap) {
          System.out.println("leap year"+leap);
}
	
		static void printLeapNot(double not_leap)
		{

		System.out.println("not leap="+not_leap);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year");
		int year =sc.nextInt();
		if(year%4==0 || year%100!=0 && year%400==0) {
			printLeap(year);

		}else {
			printLeapNot(year);

			
		}
		
	
	
	

		}

}
