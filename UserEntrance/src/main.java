import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
		System.out.println("Username : ");
		String userName =inp.nextLine();
		System.out.println("Password :");
		String password =inp.nextLine();
		
		if(userName.equals("patika")&&password.equals("java123")) {
			System.out.println("Login Successfull !");
		}
		else {
			System.out.println("Wrong Password!!Do you want change your password ? y/n :");
			String answer = inp.nextLine();
				if(answer.equals("y")) {
					System.out.println("Enter the new Password :");
					String newPassword = inp.nextLine();
					if(newPassword.equals(password) || newPassword.equals("java123")) {
						System.out.println("Password not create,please enter new password!!");
					}
					else {
						System.out.println("New Password created successfully!");
					}
				}
		}
	}

}
