import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		int a = rnd.nextInt(100);
		
		Scanner inp =new Scanner(System.in);
		int right =0;
		boolean res =false;
		int[] predicts = new int[5];
		
		while(right < 5&&res==false) {
			System.out.println("Enter a Predict : ");
			int b=inp.nextInt();
			
			if(b<0||b>100) {
				right++;
				System.out.println("Wrong :Predict is Out of Range(0,100)\n You have "+(5-right)+" rights!");
			}
			else {
				if(b<a) {
					System.out.println("Your Predict is smaller than the secret number!");
					predicts[right++]=b;
				}
				else if(b>a) {
					System.out.println("Your Predict is greater than the secret number!");
					predicts[right++]=b;
				}
				else {
					System.out.println("Congratulations! You found the secret number! The number is : "+a);
					res=true;
				}
				
			
			}
			System.out.println();
		}
		
		if(!res) {
			System.out.println("Unfortunately !! You lost the game :( The Number was : "+ a);
			System.out.println("Your Predicts are : "+Arrays.toString(predicts));
		}
		
	}

}
