import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int input=inp.nextInt();
		double sum=0;
		
		for(double i=1;i<=input;i++) {
			sum+=1/i;
		}
		System.out.println(sum);
	}

}
