import java.util.Scanner;


public class FactorialSummation {
	
	public static void main(String[] args){
	
		Scanner reader = new Scanner(System.in);
		int fac = Integer.parseInt(reader.nextLine());
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
		while(fac != 0){
			int value = 1;
			while( fac > 0){
				value *= fac;
				fac--;
			}
			String cValue = value+"";
			int numValue = 0;
			for(int i =0; i < cValue.length(); i++){
				numValue += Integer.parseInt(cValue.charAt(i)+"");
			}
			System.out.println(numValue);
			fac = Integer.parseInt(reader.nextLine());
		}
	}

}
