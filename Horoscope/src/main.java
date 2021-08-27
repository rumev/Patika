import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Month of Birthday : ");
		int month =inp.nextInt();
		System.out.println("Enter the Day of Birthday : ");
		int day = inp.nextInt();
		
		if(month<1||month>12||day<1||day>31)System.out.println("An input or more are wrong !!");
		else {
			if(month==1) {
				if(day<=21)System.out.println("Your Horoscope is Capricorn!!");
				else System.out.println("Your Horoscope is Aquarius!!");
			}
			else if(month==2) {
				if(day<=19)System.out.println("Your Horoscope is Aquarius!!");
				else if(day>29)System.out.println("Wrong input!!!");
				else System.out.println("Your Horoscope is Pisces!!");
			}
			else if(month==3) {
				if(day<=20)System.out.println("Your Horoscope is Pisces!!");
				else System.out.println("Your Horoscope is Aries!!");
			}
			else if(month==4) {
				if(day<=20)System.out.println("Your Horoscope is Aries!!");
				else System.out.println("Your Horoscope is Taurus!!");
			}
			else if(month==5) {
				if(day>=21)System.out.println("Your Horoscope is Taurus!!");
				else System.out.println("Your Horoscope is Gemini!!");
			}
			else if(month==6) {
				if(day<=22)System.out.println("Your Horoscope is Gemini!!");
				else System.out.println("Your Horoscope is Cancer!!");
			}
			else if(month==7) {
				if(day<=22)System.out.println("Your Horoscope is Cancer!!");
				else System.out.println("Your Horoscope is Leo!!");
			}
			else if(month==8) {
				if(day<=22)System.out.println("Your Horoscope is Leo!!");
				else System.out.println("Your Horoscope is Virgo!!");
			}
			else if(month==9) {
				if(day>=22)System.out.println("Your Horoscope is Virgo!!");
				else System.out.println("Your Horoscope is Libra!!");
			}
			else if(month==10) {
				if(day<=22)System.out.println("Your Horoscope is Libra!!");
				else System.out.println("Your Horoscope is Scorpio");
			}
			else if(month==11) {
				if(day<=21)System.out.println("Your Horoscope is Scorpio!!");
				else System.out.println("Your Horoscope is Sagittarius!!");
			}
			else {
				if(day<=21)System.out.println("Your Horoscope is Sagittarius!!");
				else System.out.println("Your Horoscope is Capricorn!!");
			}
		}
	}

}
