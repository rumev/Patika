import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {5,9,9,8,65,5,8,6,2,6,2};
		int[] list2 =new int[list.length];
		int start=0;
		
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length;j++) {
				if(i!=j&&list[i]==list[j]&&list[i]%2==0) {
					list2[start++]=list[i];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(list2));
	}

}
