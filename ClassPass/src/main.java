import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0;
		Scanner inp =new Scanner(System.in);
		System.out.println("Enter the Math Grade : ");
		int math =inp.nextInt();
		System.out.println("Enter the Physic Grade : ");
		int phy = inp.nextInt();
		System.out.println("Enter the Turkish Grade : ");
		int tur = inp.nextInt();
		System.out.println("Enter the Chemistry Grade : ");
		int chem = inp.nextInt();
		System.out.println("Enter the Music Grade : ");
		int music = inp.nextInt();
		
		if(math>=0&&math<=100) {
			count++;
			sum +=math;
		}
		if(phy>=0&&phy<=100) {
			count++;
			sum +=phy;
		}
		if(tur>=0&&tur<=100) {
			count++;
			sum +=tur;
		}
		if(chem>=0&&chem<=100) {
			count++;
			sum +=chem;
		}
		if(music>=0&&music<=100) {
			count++;
			sum +=music;
		}
		double average = sum/count;
		if(average>=55) {
			System.out.println("Class Passed!!");
		}
		else System.out.println("Class Not Passed!!");
	}

}
