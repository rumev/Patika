import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		double weight,height,bmi;
		
		System.out.print("Enter the Weight : ");
		weight=inp.nextDouble();
		System.out.print("Enter the Height : ");
		height=inp.nextDouble();
		
		bmi=weight/(height*height);
		
		System.out.println("Body Mass Index is : "+bmi);
	}

}
