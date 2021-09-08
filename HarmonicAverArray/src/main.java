
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numbers = {1,2,3,4,5};
		double sum=0;
		
		for(int i=0;i<numbers.length;i++) {
			sum=sum+(1/numbers[i]);
		}
		System.out.println("Harmonic Average of Array : "+(numbers.length/sum));
		
	}

}
