import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int n1 = inp.nextInt();
		System.out.println("Enter the 2nd number : ");
		int n2 = inp.nextInt();
		
		System.out.println("1-Add\n2-Subtract\n3-Multiply\n4-Division\n");
		System.out.println("Please make a choice : ");
		int select =inp.nextInt();
		int result =0;
		switch (select) {
		
		case 1:
			result =n1+n2;
			System.out.println("Sum is :" +result);
			break;
		case 2:
			result =n1-n2;
			System.out.println("Subtract is :" +result);
			break;
		case 3:
			result=n1*n2;
			System.out.println("Multiply is :" +result);
			break;
		case 4:
			result =n1/n2;
			System.out.println("Division is :" +result);
			break;
		}
	}

}
