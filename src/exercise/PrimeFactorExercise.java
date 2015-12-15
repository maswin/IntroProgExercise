package exercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorExercise {

	private boolean isPrime(int n){
		for(int i=2; i< Math.sqrt(n); i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public List generate(int n){
		List<Integer> primeFactors = new ArrayList<Integer>();
		
		for(int i=2; i<=n;i++){
			if(n%i==0){
				if(isPrime(i)){
					primeFactors.add(i);
				}
			}
		}
		return primeFactors;
	}
	
	public static void main(String args[]){
		
		int n = 30;
		
		PrimeFactorExercise primeFactorExercise = new PrimeFactorExercise();
		
		System.out.println(primeFactorExercise.generate(n).toString());
	}
}
