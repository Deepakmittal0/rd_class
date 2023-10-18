package assignment_2;

import java.util.Scanner;

public class seperate_noadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no");
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b=a%10;
		int c=b%10;
		int e=c%10;
		int d=b+c+e;
		System.out.println(d);
	}

}
