package exercise;

public class TriangleExercise {

	public void printAsterisk(){
		System.out.println("*");
	}
	
	public void drawHorizontalLine(int n){
		for(int row = 0; row < n; row++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void drawVerticalLine(int n){
		for(int row=0; row < n; row++){
			System.out.println("*");
		}
	}
	
	public void drawRightTriangle(int n){
		for(int row = 0; row < n; row++){
			drawHorizontalLine(row+1);
		}
	}
	
	public static void main(String args[]){
		
		int n = 3;
		
		TriangleExercise triangleExercise = new TriangleExercise();
		
		triangleExercise.printAsterisk();
		triangleExercise.drawHorizontalLine(n);
		triangleExercise.drawVerticalLine(n);
		triangleExercise.drawRightTriangle(n);
		
	}
}
