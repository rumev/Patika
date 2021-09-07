import java.util.Random;
public class Ring {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Ring(Fighter f1,Fighter f2,int minWeight,int maxWeight){
		this.f1=f1;
		this.f2=f2;
		this.minWeight=minWeight;
		this.maxWeight=maxWeight;
	}
	
	public void run() {
		if(checkWeight()) {
			if(whoBegin()==0) {
			while(f1.health>0&&f2.health>0) {
				System.out.println("=========NEW ROUND========");
				
				f2.health=f1.hit(f2);
				if(isWin())break;
				
				f1.health=f2.hit(f1);
				if(isWin())break;
				
				
				printScore();
			}
			}
			else {
				while(f1.health>0&&f2.health>0) {
					System.out.println("=========NEW ROUND========");
					
					f1.health=f2.hit(f1);
					if(isWin())break;
					
					f2.health=f1.hit(f2);
					if(isWin())break;
					
									
					printScore();
				}
			}
		}
		else System.out.println("Fighters' weight are not equivalent!");
	}
	
	public boolean checkWeight() {
		return (f1.weight>=minWeight&&f1.weight<=maxWeight)&&(f2.weight>=minWeight&&f2.weight<=maxWeight);
	}
	
	public boolean isWin() {
		if(f1.health<=0) {
			System.out.println("Winner is "+f2.name);
			return true;
		}else if(f2.health<=0) {
			System.out.println("Winner is "+f1.name);
			return true;
		}
		return false;
		
	}
	
	public int whoBegin() {
		Random rnd = new Random();
		return rnd.nextInt(2);
	}
	
	public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Left Health \t:" + f1.health);
        System.out.println(f2.name + " Left Health \t:" + f2.health);
    }
}
