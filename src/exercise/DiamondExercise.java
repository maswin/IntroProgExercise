package exercise;

public class DiamondExercise {
	
	private void printSpace(int n){
		for(int row = 0; row < n; row++){
			System.out.print(" ");
		}
	}
	
	private void printAsterisk(int n){
		for(int row = 0; row < n; row++){
			System.out.print("*");
		}
	}
	
	public void drawIsoscelesTriangle(int n){
		drawIsoscelesTriangle(n, 0);
	}
	public void drawIsoscelesTriangle(int n, int shift){
		for(int row = 0; row < n; row++){
			int spaceCount = n-row-(1-shift);
			int asteriskCount = (row*2)+1;
			
			printSpace(spaceCount);
			printAsterisk(asteriskCount);
			//printSpace(spaceCount);	
			
			System.out.println();
		}
	}
	
	public void drawReverseIsoscelesTriangle(int n){
		drawReverseIsoscelesTriangle(n, 0);
	}
	public void drawReverseIsoscelesTriangle(int n, int shift){
		for(int row = n-1; row >= 0; row--){
			int spaceCount = n-row-(1-shift);
			int asteriskCount = (row*2)+1;
			
			printSpace(spaceCount);
			printAsterisk(asteriskCount);
			//printSpace(spaceCount);	
			
			System.out.println();
		}
	}
	
	public void drawDiamond(int n){
		drawIsoscelesTriangle(n);
		drawReverseIsoscelesTriangle(n-1, 1);
	}
	
	public void drawDiamondWithName(int n, String name){
		drawIsoscelesTriangle(n-1, 1);
		System.out.println(name);
		drawReverseIsoscelesTriangle(n-1, 1);
	}
	
	public static void main(String args[]){
		
		int n = 3;
		String name = "aswin";
		
		DiamondExercise diamondExercise = new DiamondExercise();
		
		diamondExercise.drawIsoscelesTriangle(n);
		diamondExercise.drawDiamond(n);
		diamondExercise.drawDiamondWithName(n, name);
	}
}
