import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Number of Set Elements : ");
		int n = inp.nextInt();
		System.out.println("Enter Number of Subset : ");
		int r = inp.nextInt();
		
		int comb = fact(n)/(fact(r)* fact(n-r));
		System.out.println(comb);
		
	}

	public static int fact(int i) {
		int res=1;
		while(i!=1) {
			res*=i;
			i--;
		}
		
		return res;
	}
}
