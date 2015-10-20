import java.util.Scanner;


public class FactorAndFactorials {

	public static void main(String[] args){
		
		
		int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		int[] count = new int[prime.length];
		Scanner reader = new Scanner(System.in);
		int fac = Integer.parseInt(reader.nextLine());
		while(fac != 0){
			System.out.print(fac+"! = ");
			//int value = 1;
			while( fac > 0){
				//value *= fac;
				int cFac = fac;
				for(int i = 0; i < prime.length; i++){
					while(cFac % prime[i] == 0){
						count[i] += 1;
						cFac = cFac / prime[i];
						//System.out.println(value);
					}
					if(cFac == 1){
						break;
					}
				}
				
				fac--;
			}
			
			
			for(int i = 0; i < count.length; i++){
				if(count[i] == 0)
					break;
				System.out.print(count[i] + " ");
			}
			System.out.println();
			fac = Integer.parseInt(reader.nextLine());
			count = new int[prime.length];
		}
	
		
	}
	
	public static boolean prime(int a){
		boolean prime = true;
		for(int i=2; i < a/2; i++){
			if(a % i == 0){
				prime = false;
			}
			
		}
		return prime;
	}
}
