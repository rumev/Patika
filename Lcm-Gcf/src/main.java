import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		int first =inp.nextInt();
		System.out.println("Enter the 2nd Number : ");
		int second =inp.nextInt();
		int lcm=0,i=1;
		
		while(first*second>=i) {
			if(i%first==0&&i%second==0) {
				lcm=i;
				break;
			}
			else
			i++;
		}
		
		System.out.println("LCM is : "+lcm);
		i=1;
		int gcf=1;
		if(first<second) {
			while(i<=first) {
				if(first%i==0&&second%i==0) {
					gcf=i;
				}
				i++;
			}
		}
		else {
			while(i<=second) {
				if(first%i==0&&second%i==0) {
					gcf=i;
				}
				i++;
			}
		}
		System.out.println("GCF is : "+gcf);
	}

}
