import java.util.Scanner;

//class Main{
class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int Case = Integer.parseInt(reader.nextLine());

		int n;
		for(int c = 0; c < Case; c++){
			n = Integer.parseInt(reader.nextLine());
			String[] r_in = reader.nextLine().split("\\s+");
			int[] r = new int[n];
			int prev = 0, value, k = 0, diff;
			for(int i = 0; i < r_in.length; i++){

				value = Integer.parseInt(r_in[i]);
				diff = Math.abs(prev - value);
				if (diff > k){
					k = diff;
				}
				prev = value;
				r[i] = value;
			}

			int k_counter = k;
			while(k_counter < 10000000){

				if(check(k_counter, r)){
					System.out.println("Case " + (c+1) + ": " + k_counter);
					break;
				}

				k_counter++;
			}
		}
	}

	public static boolean check(int k, int[] r){
		int k_counter = k;
		int prev = 0;
		for(int i = 0; i < r.length; i++){
			int diff = Math.abs(prev - r[i]);

			if( diff > k_counter){
				return false;
			} else if (diff == k_counter){
				k_counter--;
			}
			if(i == r.length-1){
				return true;
			}
			prev = r[i];
		}

		return false;
	}
}
