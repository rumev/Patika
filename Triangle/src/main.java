import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		int a,b,c;
		double u,area;
		
		System.out.print("Enter the 1st Edge : ");
		a=inp.nextInt();
		System.out.print("Enter the 2nd Edge : ");
		b=inp.nextInt();
		System.out.print("Enter the 3rd Edge : ");
		c=inp.nextInt();
		
		u = (a+b+c)/2;
		
		area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Area is :"+area);
	}

}
