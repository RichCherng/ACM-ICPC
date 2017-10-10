import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FactorAndFactorials {

	static ArrayList<Integer> primes;
	public static void main(String[] args){

		primes = primeSieve(10000);
		Scanner reader = new Scanner(System.in);
		int in ;
		while( (in = Integer.parseInt(reader.nextLine())) != 0 ){
			primeFactor(in);
		}
	}

	public static void primeFactor(int N){
		System.out.print(N+ "! = ");

		ArrayList<Integer> primeCounter = new ArrayList<Integer>();
		int primeIndex, curPrime;

		// Counter from 2 to N
		for(int fac = 2; fac <= N; fac++){

			primeIndex = 0; 		// Reset primeIndex
			int temp = fac;

			while(temp > 1){ // reduce temp by prime

				// Check if primeCounter has tracking the new value
				if(primeCounter.size()-1 < primeIndex){
					primeCounter.add(0);
				}

				curPrime 	= primes.get(primeIndex); 		// Get the current prime
				int counter = primeCounter.get(primeIndex); // Get the cuurent prime's counter
				while(temp % curPrime == 0){				// if the current temp can be reduce by prime
					temp = temp / curPrime;
					counter++;
				}
				primeCounter.set(primeIndex, counter); 	// Update the counter
				primeIndex++;							// Move prime counter

			}
			// Reset PrimeIndex
			primeIndex = 0;
		}
		for(int i : primeCounter){
			System.out.print(i + " ");
		}
	}

	public static ArrayList<Integer> primeSieve(int n){

		boolean[] p = new boolean[n];
		ArrayList<Integer> prime= new ArrayList<Integer>();
		Arrays.fill(p, Boolean.TRUE); // Initially all set to true
		for(int i = 2; i < n; i++){
//			System.out.println(p[i] + " " + i);
			if(p[i]){ // true is prime
				prime.add(i);
				for(int j = i+i; j < n; j = j + i){
//					System.out.println(j);
					p[j] = false;
//					System.out.println(p[j]);
				}
			}
		}

		return prime;
	}
}
