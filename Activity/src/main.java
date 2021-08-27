import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Temperature :");
		int temp =inp.nextInt();
		
		if(temp<5)System.out.println("You can go ski ");
		else if(temp>=5&&temp<=15)System.out.println("You can go to the cinema ");
		else if(temp>15&&temp>=25)System.out.println("You can go to the picnic ");
		else System.out.println("You can go to swim");
		
	}

}
