package assifnment_func;

public class even_odd_func {

	
	static void printEven(int i) {
		System.out.println("even="+i);
}
	
	static void printOdd(int i) {
		System.out.println("odd="+i);
}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				printEven(+i);
				
			}
			else {
		printOdd(+i);
		}

		}}	}

