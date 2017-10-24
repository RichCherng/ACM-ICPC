import java.math.BigInteger;
import java.util.Scanner;

public class Integer_Inquiry {

	public static void main(String[] args){

		Scanner reader = new Scanner(System.in);
		String in;
		BigInteger sum = new BigInteger("0");
		while( !(in = reader.nextLine()).equals("0"))
		{
			sum = sum.add(new BigInteger(in));
		}

		System.out.println(sum);
	}
}
