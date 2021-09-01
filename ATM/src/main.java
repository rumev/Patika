import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp= new Scanner(System.in);
		int right=3,balance=1500,select=0;
		String userName,password;
		
		while(right>0) {
			System.out.println("Enter the Username : ");
			userName=inp.nextLine();
			System.out.println("Enter the Password : ");
			password =inp.nextLine();
			
			if(userName.equals("patika")&&password.equals("dev123")) {
				System.out.println("Hi Welcome to Kodluyoruz Bank !");
				
				while(select!=4) {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Logout");
                    System.out.print("Please Make a Choice : ");
                    select = inp.nextInt();
                    
                    switch (select) {
                    case 1:
                    	System.out.print("Amount of Money : ");
                        int price = inp.nextInt();
                        balance += price;
                        break;
                    case 2:
                    	System.out.print("Amount of Money : ");
                         price = inp.nextInt();
                        if (price > balance) {
                            System.out.println("Balance is not enough.");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                    	System.out.println("Balance is : " + balance);
                    	break;
                    
                    }
                } 
				System.out.println("See You Again!");
				break;
				
			}
			else {
				right--;
				System.out.println("Wrong Username or Password. Please Try Again !!");
				if(right==0) {
					System.out.println("Your account has been suspended. Contact your bank.");
				}
				else {
					System.out.println("You have "+right+" login left.");
				}
			}
		}
	}

}
