import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int row =inp.nextInt();
		System.out.println("Enter Number of Columns : ");
		int col =inp.nextInt();
		int mines =(row*col)/4;
		
		Object[][] temp = new Object[row][col];
		
		for(int i=0;i<mines;i++) {	//Mine create
			boolean hasMine=false;
			while(hasMine==false) {
			
				int x =rnd.nextInt(row);
			
				int y =rnd.nextInt(col);
			
				if(temp[x][y]=="*")hasMine=false;
				else {
					temp[x][y]="*";
					hasMine=true;
				}
			
			}
			
		}
		
		for(int i=0;i<temp.length;i++) {	//Create of all numbers 
			int count=0;
			for(int j=0;j<temp[1].length;j++) {
				if(i==0||j==0||i==row-1||j==col-1) {	// Edges and corners setup
					count=0;
					if(i==0&&j==0&&temp[0][0]!="*") {
						if(temp[0][1]=="*")count++;
						if(temp[1][0]=="*")count++;
						if(temp[1][1]=="*")count++;
						temp[0][0]=count;
					}
					else if(i==row-1&&j==0&&temp[row-1][0]!="*") {
						if(temp[row-2][0]=="*")count++;
						if(temp[row-2][1]=="*")count++;
						if(temp[row-1][1]=="*")count++;
						temp[row-1][0]=count;
					}
					else if(i==0&&j==col-1&&temp[0][col-1]!="*") {
						if(temp[0][col-2]=="*")count++;
						if(temp[1][col-2]=="*")count++;
						if(temp[1][col-1]=="*")count++;
						temp[0][col-1]=count;
					}
					else if(i==row-1&&j==col-1&&temp[row-1][col-1]!="*") {
						if(temp[row-1][col-2]=="*")count++;
						if(temp[row-2][col-1]=="*")count++;
						if(temp[row-2][col-2]=="*")count++;
						temp[row-1][col-1]=count;
					}
					else {
						if(i==0) {
							if(temp[i][j]!="*") {
								count=0;
								for(int k=i;k<=i+1;k++) {
									
									for(int l=j-1;l<=j+1;l++) {
										if(temp[k][l]=="*")count++;
									}
									
								}
								temp[i][j]=count;
							}
						}
						else if(j==0) {
							if(temp[i][j]!="*") {
								count=0;
								for(int k=i-1;k<=i+1;k++) {
									
									for(int l=j;l<=j+1;l++) {
										if(temp[k][l]=="*")count++;
									}
									
								}
								temp[i][j]=count;
							}
						}
						else if(i==row-1) {
							if(temp[i][j]!="*") {
								count=0;
								for(int k=i-1;k<=i;k++) {
									
									for(int l=j-1;l<=j+1;l++) {
										if(temp[k][l]=="*")count++;
									}
									
								}
								temp[i][j]=count;
							}
						}
						else if(j==col-1) {
							if(temp[i][j]!="*") {
								count=0;
								for(int k=i-1;k<=i+1;k++) {
									
									for(int l=j-1;l<=j;l++) {
										if(temp[k][l]=="*")count++;
									}
									
								}
								temp[i][j]=count;
							}
						}
					}
					
				}
				else {
					if(temp[i][j]!="*") {
					count=0;
					for(int k=i-1;k<=i+1;k++) {
						
						for(int l=j-1;l<=j+1;l++) {
							if(temp[k][l]=="*")count++;
						}
						
					}
					temp[i][j]=count;
				}
				}
			}
			
		}
		
		System.out.println("Welcome to MineField Game!");		
		Object[][] field = new Object[row][col];
		boolean isFinish =false;
		
			System.out.println();
			for(int i=0;i<field.length;i++) {
				for(int j=0;j<field[1].length;j++) {
					field[i][j]="-";
					System.out.print(field[i][j]+" ");
				}
				System.out.println();
			}
	while(isFinish==false&&isDone(field,temp)==false) {
			
		System.out.print("Enter a Row :");
		int selRow=inp.nextInt();
		System.out.println();
		System.out.print("Enter a Column :");
		int selCol=inp.nextInt();
		if(temp[selRow][selCol]!="*")field[selRow][selCol]=temp[selRow][selCol];
		else {
			field[selRow][selCol]="*";
			isFinish=true;
		}
		
		System.out.println();
		for(int i=0;i<field.length;i++) {
			for(int j=0;j<field[1].length;j++) {
				
				System.out.print(field[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++");
		
		if(isDone(field,temp))System.out.println("Congratulations!! You Won !!!");
		if(isFinish)System.out.println("Game Over :(");
		
	}
		
		
		
	}
	
	static boolean isDone(Object[][] x,Object[][] y) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[1].length;j++) {
				if(x[i][j]=="-"&&y[i][j]!="*") {
					return false;
				}				
			}			
		}
		return true;
	}

}
