package assignment_1;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the year");
		Scanner o =new Scanner(System.in);
		int year =o.nextInt();
		if(year%4==0 || year%100!=0 && year%400==0) {
			System.out.println("leap year"+year);
       }else{
    	   System.out.println("not a leap year"+year);
       }
		

	}

}
