import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int a = inp.nextInt();
		System.out.println("Enter the 2nd number : ");
		int b = inp.nextInt();
		System.out.println("Enter the 3rd number : ");
		int c = inp.nextInt();
		
		if(a<b&&a<c) {
			System.out.print(a+" ");
			if(b<c) {
				System.out.print(b+" "+c);
			}
			else System.out.print(c+" "+b);
		}
		else if(b<a&&b<c) {
			System.out.print(b+" ");
			if(a<c) {
				System.out.print(a+" "+c);
			}
			else System.out.print(c+" "+a);
		}
		else {
			System.out.print(c+" ");
			if(a<b)System.out.print(a+" "+b);
			else System.out.print(b+" "+a);
		}
	}

}
