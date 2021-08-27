import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = inp.nextInt();
		
		if(year%100==0) {
			year=year/100;
			if(year%4==0) 	System.out.println("This year is a leap year!!");
			else System.out.println("This year is not leap year!!");
		}
		else {
			if(year%4==0) System.out.println("This year is a leap year!!");
			else System.out.println("This year is not leap year!!");
		}
	}

}
