
public class Fighter {

	String name;
	int damage;
	int health;
	int weight;
	double dodge;


	Fighter(String name,int damage,int health,int weight,double dodge){
		this.name=name;
		this.damage=damage;
		this.health=health;
		this.weight=weight;
		this.dodge=dodge;
	}
	
	public int hit(Fighter foe) {
		System.out.println("--------------");
		System.out.println(this.name+" hitted to "+foe.name+" "+this.damage+" damage. ");
		
		if(foe.dodge()) {
			System.out.println(foe.name+" dodged damage.");
			
			return foe.health;				
		}
		if(foe.health-this.damage<0) {
			return 0;
		}
		
		return foe.health-this.damage;
	}
	
	
	public boolean dodge() {
		double random =Math.random()*100;
		return random <=this.dodge;
	}
}

