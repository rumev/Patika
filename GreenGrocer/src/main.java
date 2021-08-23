import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		int pear,apple,tomato,banana,eggplant;
		double cost;
		System.out.print("Enter Kg of Pear : ");
		pear = inp.nextInt();
		System.out.print("Enter Kg of Apple : ");
		apple = inp.nextInt();
		System.out.print("Enter Kg of Tomato : ");
		tomato = inp.nextInt();
		System.out.print("Enter Kg of Banana : ");
		banana = inp.nextInt();
		System.out.print("Enter Kg of Eggplant : ");
		eggplant = inp.nextInt();
		
		cost=(pear*2.14)+(apple*3.67)+(tomato*1.11)+(banana*0.95)+(eggplant*5);
		
		System.out.println("Pear : "+pear+" kg");
		System.out.println("Apple : "+apple+" kg");
		System.out.println("Tomato : "+tomato+" kg");
		System.out.println("Banana : "+banana+" kg");
		System.out.println("Eggplant : "+eggplant+" kg");
		System.out.println("Total Cost is "+cost+" TL");
	}

}
