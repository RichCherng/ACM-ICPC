import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class JumpingChampion {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int[] primeSieve = new int[1000000];
		sieve(primeSieve);

		int case_num = Integer.parseInt(reader.nextLine());
		String[] input = new String[2];
		for (int i = 0; i < case_num; i++) {
			input = reader.nextLine().split("\\s+");
			int low = Integer.parseInt(input[0]);
			int up = Integer.parseInt(input[1]);
			checkChamp(low, up, primeSieve);
		}
		reader.close();
	}

	/**
	 * Sieve of Eratosthenes
	 * 
	 * @param int[]
	 */
	public static void sieve(int[] prime) {
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) {
				int curNum = i;
				while (curNum < prime.length) {
					// f(prime[curNum+i] % i == 0){}
					curNum += i;
					if(curNum < prime.length)
						prime[curNum] = 1;
				}
			}
		}
	}

	public static void checkChamp(int low, int up, int[] prime) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int lowBound = low;

		/*
		 * while(isPrime(lowBound)){ lowBound++; }
		 */

		/*
		 * while(prime[lowBound++] == 1){
		 * 
		 * }
		 */

		for (int i = low; i < up ; i++) {
			int next = 1;
			int JP = 0;
			if (prime[i] == 0) {
				while (prime[i + next] == 1) { // If next number is not a prime
					JP++;
					next++;
					if((i + next > 50)){
						JP = -1;
						break;
					}

				}
				// if (prime[i+1] == 0){ // If next number is prime
				// Add to the map
				// JP++;
				// Add to the hash
				if (hash.containsKey(++JP)) {
					hash.put(JP, hash.get(JP) + 1);
				} else {
					hash.put(JP, 1);
				}
				// }

			}
		}

		/*
		 * int numPrime = lowBound; while(numPrime < up){ int next =
		 * nextPrime(numPrime); if (hash.containsKey( next - numPrime ))
		 * hash.put(next-numPrime, hash.get(next-numPrime) + 1); else
		 * hash.put(next-numPrime, 1); //System.out.println("test"); numPrime++;
		 * }
		 */

		//iterate throug the code
		/*Iterator it = hash.entrySet().iterator();
		Map.Entry pair = (Map.Entry) it.next();
		int max = (int) pair.getValue();
		String champ = pair.getKey() + "";
		boolean non = true;
		while (it.hasNext()) {
			pair = (Map.Entry) it.next();

			// System.out.println(pair.getKey() + " = " + pair.getValue());
			if (max < (int) pair.getValue()) {
				max = (int) pair.getValue();
				champ = pair.getKey() + "";
				non = false;
			} else if (max == (int) pair.getValue()) {
				non = true;
			}
			it.remove(); // avoids a ConcurrentModificationException
		}*/
		int max = 0;
		String champ = "";
		boolean non = false;
		for (Map.Entry<Integer, Integer> entry : hash.entrySet())
		{
			if(max < entry.getValue()){
				max = entry.getValue();
				champ = entry.getKey().toString();
				non = false;
			}
			else if ( max == entry.getValue()){
				non = true;
			}
		    //System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		if (non) {
			System.out.println("No jumping champion");
		} else
			System.out.println("The jumping champion is " + champ);
		System.out.println(hash);
	}

	public static boolean isPrime(int num) {
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

	public static int nextPrime(int num) {
		int numP = num++;
		while (!isPrime(numP)) {
			numP++;

		}
		return numP;
	}
}
