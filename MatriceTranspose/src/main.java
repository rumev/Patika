
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = {	{1,2,3},
						{4,5,6}	};
		
		for(int i=0;i<num[0].length;i++) {
			for(int j=0;j<num.length;j++) {
				System.out.print(num[j][i]+" ");
			}
			System.out.println();
		}
	}

}
