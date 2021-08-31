import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Base Number : ");
		int k =inp.nextInt();
		System.out.println("Enter the Exponent Number : ");
		int exp = inp.nextInt();
		int sum=1;
		for(int i =1;i<=exp;i++) {
			sum*=k;
		}
		System.out.println(sum);
	}

}
