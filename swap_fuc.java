package assifnment_func;

import java.util.Scanner;

public class swap_fuc{


		// TODO Auto-generated method stub
		static void printSwapx(double x)
		{
			System.out.println("x="+x);}
		
			static void printSwapy(double y)
			{

			System.out.println("y="+y);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("enter the x");
			Scanner sc= new Scanner(System.in);
			int x =sc.nextInt();
			
			System.out.println("enter the y");
			int y=sc.nextInt();
			
			
			 x=x+y;  //x=10,y=20
			 y=x-y;
			 x=x-y;
			
			printSwapx(x);
			printSwapy(y);

	}

}
