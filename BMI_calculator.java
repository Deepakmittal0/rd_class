package assignment_1;
import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the height");
		float height=sc.nextFloat();
		System.out.println("enter the Weight");
		float weight=sc.nextFloat();
		float bmi=weight/(height*height);
		System.out.println("BMI :"+bmi);

	}

}
