import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the Base Number : ");
		int base=inp.nextInt();
		System.out.println("Enter the Exponent Number : ");
		int expo =inp.nextInt();
		System.out.println(exponent(base,expo));
		
	}
	static int exponent(int base,int expo) {
		int result=1;
		if(expo==0) {
			return result;
		}
		else {
			expo--;
			result=base*exponent(base,expo);
		}
		
		return result;
	}

}
