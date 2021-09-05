import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		String menu = "1- Plus\n"
				+ "2- Minus\n"
				+ "3- Multiply\n"
				+ "4- Division\n"
				+ "5- Exponential\n"
				+ "6- Factorial\n"
				+ "7- Mode\n"
				+ "8- Area and Perimeter of Rectangular\n"
				+ "0- Exit";
		
		int select;
		do {
			System.out.println(menu);
			System.out.println("Please Make a Choice : ");
			 select =inp.nextInt();
			
			 switch (select) {
			 case 1: plus();
			 break;
			 case 2: minus();
			 break;
			 case 3: multiply();
			 break;
			 case 4: division();
			 break;
			 case 5: exponent();
			 break;
			 case 6: factorial();
			 break;
			 case 7: mode();
			 break;
			 case 8: rectangular();
			 break;
			 case 0: break;
			 default : System.out.println("Wrong Select!!");
			 }
			 System.out.println();
		}while(select !=0);
		
		
	}
	
	static void plus() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter the 1st Number :");
			int x=inp.nextInt();
		System.out.println("Enter the 2nd Number :");
			int y=inp.nextInt();
			
			System.out.println("Result is : "+x+y);
	}
	
	static void minus() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter the 1st Number :");
			int x=inp.nextInt();
		System.out.println("Enter the 2nd Number :");
			int y=inp.nextInt();
			
			System.out.println("Result is : "+(x-y));
	}
	
	static void multiply() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter the 1st Number :");
			int x=inp.nextInt();
		System.out.println("Enter the 2nd Number :");
			int y=inp.nextInt();
			
			System.out.println("Result is : "+x*y);
	}
	static void division() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter the 1st Number :");
			int x=inp.nextInt();
		System.out.println("Enter the 2nd Number :");
			int y=inp.nextInt();
			if(y==0) {
				while(y==0) {
				System.out.println("Divisior can not be 0 please enter another number : ");
			y=inp.nextInt();
				}
			}
			System.out.println("Result is : "+x/y);
	}
	static void exponent() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter a Number :");
			int x=inp.nextInt();
		System.out.println("Enter Exponential Number :");
			int y=inp.nextInt();
			
			System.out.println("Result is : "+Math.pow(x, y));
	}
	static void factorial() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter a Number :");
			int x=inp.nextInt();
			int result=1;
			for(int i=x;i>1;i--) {
				result *=i;
			}
			System.out.println("Result is :"+result);
	}
	static void mode() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter a Number :");
			int x=inp.nextInt();
		System.out.println("Enter Mode Number :");
			int y=inp.nextInt();
			
			System.out.println("Result is : "+x%y);
	}
	
	static void rectangular() {
		Scanner inp = new Scanner(System.in);	
		System.out.println("Enter the 1st Edge :");
			int x=inp.nextInt();
		System.out.println("Enter the 2nd Edge :");
			int y=inp.nextInt();
			
			System.out.println("Area is : "+x*y+"\nPerimeter is : "+(2*x+2*y));
	}
}
