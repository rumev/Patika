import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=inp.nextInt();
		int n1=0,n2=1,n3;    
		 System.out.print(n1+" "+n2); 
		    
		 for(int i=2;i<n;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		

	}

}
