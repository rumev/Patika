import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		int km;
		double cost =10;
		System.out.print("Enter the Distance : ");
		km = inp.nextInt();
		
		cost = cost+(km*2.2);
		if(cost<=20) {
			cost=20;
		}
		
		System.out.println("Cost is : "+cost);
		
	}

}
