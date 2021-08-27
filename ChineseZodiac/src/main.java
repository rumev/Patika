import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Your Year of Birth : ");
		int year=inp.nextInt();
		int mode =year%12;
		
		switch(mode) {
		case 0 :
			System.out.println("Your Chinese Zodiac is Monkey");
			break;
		case 1 :
			System.out.println("Your Chinese Zodiac is Rooster");
			break;
		case 2 :
			System.out.println("Your Chinese Zodiac is Dog");
			break;
		case 3 :
			System.out.println("Your Chinese Zodiac is Pig");
			break;
		case 4 :
			System.out.println("Your Chinese Zodiac is Mouse");
			break;
		case 5 :
			System.out.println("Your Chinese Zodiac is Ox");
			break;
		case 6 :
			System.out.println("Your Chinese Zodiac is Tiger");
			break;
		case 7 :
			System.out.println("Your Chinese Zodiac is Rabbit");
			break;
		case 8 :
			System.out.println("Your Chinese Zodiac is Dragon");
			break;
		case 9 : 
			System.out.println("Your Chinese Zodiac is Snake");
			break;
		case 10 :
			System.out.println("Your Chinese Zodiac is Horse");
			break;
		case 11 :
			System.out.println("Your Chinese Zodiac is Sheep");
			break;
		}
			
		
	}

}
