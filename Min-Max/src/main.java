import java.util.Arrays;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
		System.out.println("Enter the Number of Inputs : ");
		int n=inp.nextInt();
		int[]numbers=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter a Number : ");
			numbers[i] =inp.nextInt();
		}
		int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
	}

}
