import java.util.Arrays;
import java.util.Scanner;


public class aout {
	
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		while(read.hasNext()){
			String[] input = read.nextLine().split("\\s+");
			if(Integer.parseInt(input[0]) == 0 && Integer.parseInt(input[1]) == 0){
				break;
			}
			char[] word1 = input[0].toCharArray();
			char[] word2 = input[1].toCharArray();
			Arrays.sort(word1);
			Arrays.sort(word2);
			boolean anagram = Arrays.equals(word1,word2);
			if(anagram){
				if(isPrime(Integer.parseInt(input[0]))){
					System.out.println("Anagrammatic Primes");
				}
				else
					System.out.println("Anagram");
			}else if(isPrime(Integer.parseInt(input[0])) && isPrime(Integer.parseInt(input[1]))){
				System.out.println("Prime");
			} else
				System.out.println("Neither");
		}
	}
	
	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	/*boolean isAnag(String s1, String s2){
		String c1 = Array.sort(s1.toChar)
		return Arrays.sort(s1.toCharArray()).equals(Arrays.sort(s2.toCharArray()));
	}*/
}
