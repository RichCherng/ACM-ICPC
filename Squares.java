import java.util.Scanner;

public class Squares {

	static int[] square ;
	public static void main(String[] args){
		square = generateSquare(101);
		Scanner reader = new Scanner(System.in);
		String input;

		while( !(input = reader.nextLine()).equals("0")){
			System.out.println(findBase(input));
		}

	}

	public static int findBase(String input){
		int base = 0;

		// Get lowest base possible
		for(char c: input.toCharArray()){
			int b = Integer.parseInt(c+"");
			if( (b+1) > base){
				base = b+1;
			}
		}

		int baseSquare, value;
		for(int b = base; b < 100; b++){
			value = convert(b, input);

			// Check if perfect square
			for(int i = 1; i < square.length; i++){
				if(square[i] == value){
					return b;
				}
			}
		}

		return -1;
	}

	public static int convert(int base, String num){
		int val = 0;
		int baseValue = 1;
		for(int i = num.length() - 1; i >= 0; i--){

			val += baseValue * Integer.parseInt(num.charAt(i)+"");

			baseValue *= base;
		}
		return val;
	}

	public static int[] generateSquare(int n){
		int[] list = new int[n];

		int odd = 1;
		for(int i = 1; i < n; i++){
			list[i] = list[i-1] + odd;
			odd += 2;
		}

		return list;
	}
}
