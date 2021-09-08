import java.util.Scanner;
import java.util.Arrays;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the Array Length : ");
		int len=inp.nextInt();
		int[] numbers = new int[len];
		
		for(int i =0;i<len;i++) {
			System.out.println("Enter "+(i+1) +". Number : ");
			numbers[i]=inp.nextInt();
		}
		Arrays.sort(numbers);
		
		for(int i=0;i<len;i++) {
			System.out.print(numbers[i]+" ");
		}
	}

	
}
