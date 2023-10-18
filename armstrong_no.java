package assignment_2;

import java.util.Scanner;

public class armstrong_no {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	System.out.println("enter the no");
	Scanner o =new Scanner(System.in);
	int num=o.nextInt();
	int arms, c,rem;arms=0;
	c=num;
	while(num>0) 
	{
	 rem=num%10;
	 arms += Math.pow(rem,num);
     num=num/10;
		}
	
	if(c==arms) {
		System.out.println("armstrong no");
		
	}
	else {
		System.out.println("not arsmtrong");
	}
	}

}
