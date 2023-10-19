package assignment_2;

import java.util.Scanner;

public class sum_digit_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int r,sum=0;
		while(0<n) {
			 r=n%10;
			 sum+=r;
			n=n/10;}
			System.out.println("digit of sum="+sum);
			
		}


	}

