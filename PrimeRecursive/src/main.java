import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=inp.nextInt();
		if(primeCheck(n,2))System.out.println(n+" is a prime number !");
		else System.out.println(n+" is not prime number !");
	}
	
	static boolean primeCheck(int n,int i) {
		
		if(n<=2) return n==2?true:false;
		
		if(n==i) return true;
		else {
			if(n%i==0)return false;
			else return primeCheck(n,i+1);
		}
		
		
	
	}

}
