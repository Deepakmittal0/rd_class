package assignment_2;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no");
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int r=1;
		for(int i=1;i<=a;i++) {
			r*=i;
		}
		System.out.println("fac="+r);
		
	System.out.println();	
	}
}
