import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		int math,physic,chemistry,turkish,history,music,summary,average;
		
		String result;
		
		System.out.print("Enter the Math Grade : ");
		math = inp.nextInt();
		System.out.print("Enter the Physic Grade : ");
		physic = inp.nextInt();
		System.out.print("Enter the Chemistry Grade : ");
		chemistry = inp.nextInt();
		System.out.print("Enter the Turkish Grade : ");
		turkish = inp.nextInt();
		System.out.print("Enter the History Grade : ");
		history = inp.nextInt();
		System.out.print("Enter the Music Grade : ");
		music = inp.nextInt();
		
		summary = math+physic+chemistry+turkish+history+music;
		average=summary/6;
		result = (average>60)? "ClassPassed" : "ClassNotPassed";
		System.out.println(result);
	}

}
