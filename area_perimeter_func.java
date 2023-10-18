package assifnment_func;

import java.util.Scanner;

public class area_perimeter_func {


		// TODO Auto-generated method stub
		static void printArea(double area) {
			System.out.println("Area="+area);
		}
		static void printPerimeter(double perimeter)
		{
			System.out.println("perimter="+perimeter);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("enter the length");
			Scanner sc= new Scanner(System.in);
			int l =sc.nextInt();
			
			System.out.println("enter the breadth");
			int b=sc.nextInt();
			
			
			int y=2*(l+b);
			int x=l*b;
			printArea(x);
			printPerimeter(y);

	}

}
