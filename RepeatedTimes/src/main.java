import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {10,20,20,10,10,20,5,20,10,20,5};
		HashMap<Integer,Integer> control = new HashMap<Integer,Integer>();
		
		for(int i =0;i<list.length;i++) {
			if(control.containsKey(list[i]));
			else {
				int count=1;
			for(int j=0;j<list.length;j++) {
				if(i!=j&&list[i]==list[j])count++;
			
			}
			control.put(list[i], count);
			
			}
		}
		
		for(int i : control.keySet()) {
			System.out.println(i+" is repeated "+control.get(i)+" times");
		}
	}

}
