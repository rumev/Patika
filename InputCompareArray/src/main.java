import java.util.Scanner;
import java.util.Arrays;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = inp.nextInt();
		
		Arrays.sort(list);
		int a=0;
		if(list[0]>n)System.out.println(n+" is the smaller than numbers in array!");
		else if(list[list.length-1]<n)System.out.println(n+" is the higher than numbers in array!");
		else {
		
			for(int i =0;i<list.length;i++) {
			if(list[i]>n) {
				a=i;
				break;
			}
			
		}
		System.out.println("The Nearest number of lower than "+n+" is :"+list[a-1]);
		System.out.println("The Nearest number of greater than "+n+" is :"+list[a]);
		}
        
		
	}

}
