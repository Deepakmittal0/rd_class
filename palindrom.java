package assignment_2;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num=sc.nextInt();
		int c,r,s=0;
		c=num;
		while(0<num) {
			r=num%10;
			s=(s*10)+r;
			num=num/10;
			}
		if(c==s) {
		System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrom");
		}
		
	}
		
}