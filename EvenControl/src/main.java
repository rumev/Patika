import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int sum=0,value;
		boolean flag = true;
		
		while(flag==true) {
			
			value =inp.nextInt();
			
			if(value%2!=0) flag=false;
			else {
				if(value%4==0) {
					sum +=value;
				}
				System.out.println("Enter the Next Value : ");
			}
		}
		System.out.println(sum);
	}

}
