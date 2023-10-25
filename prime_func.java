package assignment_func;
import java.util.Scanner;
public class prime_func {
static void printPrime(int prime) {
	System.out.println("prime");

}

static void printNotPrime(int not_prime) {
	System.out.println("not prime");
}

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
	printPrime(count);
		
		}else {
			
		printNotPrime(count);
	}
		}

}