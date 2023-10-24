package assifnment_func;
import java.util.Scanner;
public class menu_calculator_func {
	
	static void printAdd(double add) {
		System.out.println("add: "+add);

	}
	static void printSub(double sub) {
		System.out.println("subtraction: "+sub);
		
	}
	static void printMul(double mul) {
		System.out.println("subtraction: "+(mul));
	}
	static void printModulo(double mod) {
		System.out.println("modulo: "+mod);
	}
	static void printQuotient(double quo) {
		System.out.println("quotient: "+quo);
	}
	
	static void printInvalid(double inv) {
		System.out.println("not found: "+inv);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the ist no");
		int a=sc.nextInt();
		System.out.println("enter the 2nd no");
		int b=sc.nextInt();
		System.out.println("1 for add : 2 for subtract: 3 for multiply 4 for module :5for quotient");
		ch=sc.nextInt();
		if(ch==1) {
			int add=a+b;
		printAdd(add);
		}
		else if(ch==2) {
			int subtract=a-b;
			printSub(subtract);
		}
		else if(ch==3) {
			int mul=a*b;
			printMul(mul);
		}
		else if(ch==4) {
			int mod=a%b;
			printModulo(mod);
	    }
		else if(ch==5) {
	    	int quo=a/b;
			printQuotient(quo);
		}
		else {
				printInvalid(ch);
				}
			}
		}