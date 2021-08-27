import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Distance as KM : ");
		int km=inp.nextInt();
		System.out.println("Enter your age : ");
		int age = inp.nextInt();
		System.out.println("Enter type of Flight : 1-One way 2-Round trip ?");
		int type =inp.nextInt();
		if(km<0||age<18||type<1||type>2)System.out.println("Wrong Input!!");
		else {
		double normal_cost = km*0.1;
		System.out.println("Normal cost is : "+normal_cost);
			double discounted_cost=normal_cost;
			if(age<12) {
				discounted_cost=normal_cost/2;
			}
			else if(age>=12&&age<=24) {
				discounted_cost = normal_cost*0.9;
			}
			else if(age>65) {
				discounted_cost=normal_cost*0.7;
			}
			
			if(type==2) {
				discounted_cost=discounted_cost*0.8;
			}
			System.out.println("Total Cost is : "+discounted_cost);
	}
		}

}
