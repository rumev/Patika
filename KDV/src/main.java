import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the Money : ");
		double money = inp.nextDouble();
		double kdv =0,kdvliFiyat;
		
		if(money>0 && money<=1000) {
			kdv=0.18;
		}
		else if(money>1000) {
			kdv =0.08;
		}
		else {
			System.out.println("Unavailable Money");
		}
		
		kdvliFiyat= money*kdv+money;
		
		System.out.println("Kdvli Fiyat : "+kdvliFiyat+"\nKDV : "+kdv);
	}

}
