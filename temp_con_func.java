package assifnment_func;

	import java.util.Scanner;

	public class temp_con_func {
		static void printCel(int x)
		{
			System.out.println("cel="+x);}
		
			static void printFeh(int y)
			{

			System.out.println("feh="+y);
			
		}

		public static void main(String[] args) {
			
			System.out.println("enter the temp for feh to cel");
			Scanner o =new Scanner(System.in);
			int feh=o.nextInt();
			int cel=(feh-32)*5/9;
			System.out.println("enter the temp for cel to feh");

			cel=o.nextInt();
			feh =(cel*9/5)+32;
			printCel(cel);
			printFeh(feh);
			
			
		}

	}



