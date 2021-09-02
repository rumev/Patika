
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<100;i++) {
			boolean flag=true;
			for(int k=2;k<i;k++) {
				if(i%k==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) System.out.print(i+" ");
		}
	}

}
