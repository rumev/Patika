import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = inp.nextInt();
		int temp=n;
		int count=0;
		int control=0;
		
		while(temp!=0) {
			temp/=10;
			count++;			
		}
		
		temp=n;
		
		for(int i=count-1;i>=0;i--) {
			control=(int) (control+temp%10 * Math.pow(10, i));
			temp /=10;
		}
		
		if(control==n)System.out.println(n +" is a palindrome number !");
		else System.out.println(n +" is not a palindrome number !");
	}

}
