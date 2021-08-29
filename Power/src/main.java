import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int value = inp.nextInt();
		System.out.println("Numbers of 4's Power : ");
		for(int i=1;i<=value;i*=4) {
			System.out.print(i+" ");		
		}
		System.out.println();
		System.out.println("Numbers of 5's Power : ");
		for(int i=1;i<=value;i*=5) {
			System.out.print(i+" ");		
		}
	}

}
