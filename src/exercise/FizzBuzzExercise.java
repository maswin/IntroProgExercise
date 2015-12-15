package exercise;

public class FizzBuzzExercise {

	public void fizzBuzz(int n){
		for(int i=1; i<=n; i++){
			if(i%3==0 || i%5==0){
				if(i%3 == 0) {
					System.out.print("Fizz");
				}

				if(i%5 == 0) {
					System.out.print("Buzz");
				}
			}else{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		
		int n = 100;
		
		FizzBuzzExercise fizzBuzzExercise = new FizzBuzzExercise();
		
		fizzBuzzExercise.fizzBuzz(n);
	}
}
