
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fighter marc = new Fighter("Marc" , 15 , 100, 90, 1);
	      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
	      Ring r = new Ring(marc,alex , 90 , 100);
	      r.run();
	}

}
