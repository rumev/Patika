import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		int r;
		double sliceArea;
		System.out.print("Enter the Radius : ");
		r= inp.nextInt();
		
		sliceArea=(Math.PI*r*r)/360;
		System.out.println("Area of Slice is : a *"+sliceArea);
	}

}
