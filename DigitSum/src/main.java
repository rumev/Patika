import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String entry =inp.next();
		int a=entry.length();
		int b =Integer.parseInt(entry);
		int sum=0;
		
		for(int i=0;i<entry.length();i++) {
		sum+=b%10;
		b=b/10;
		}
		System.out.println(sum);
	}

}
