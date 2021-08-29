import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int value =scan.nextInt();
		int count=0,sum=0;
		for(int i=0;i<=value;i++) {
			if(i%3==0&&i%4==0) {
				count++;
				sum +=i;
			}
		}
		
		System.out.println("Modes Average is :"+sum/count);
	}

}
