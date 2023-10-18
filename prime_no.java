package assignment_2;
import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("enter the no");
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		for(int i=1;i<=n; i++) {
		if(n%i==0) {
			count++;
		}
		}
		if(count==2)  {
			System.out.println("prime no");
		
		}else {
			
			System.out.println("not prime");
	
	}
		}

}