import java.util.Scanner;
public class main {
	private static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		 n =inp.nextInt();
		System.out.print(n+" ");
		minus(n);
		
	}
	
	static int minus(int x) {
		int temp=x;
		if(temp<=0) {
			plus(temp);
		}
		else {
			temp-=5;
			System.out.print(temp+" ");
			return minus(temp);
		}
		
		return temp;
	}
	
	static int plus(int y) {
		if(y==n);
		else {
			y+=5;
			System.out.print(y+" ");
			return plus(y);
		}
		return y;
	}

}
