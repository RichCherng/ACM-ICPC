import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;


public class VeryLongInt {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner reader = new Scanner(System.in);
		String line;
		BigInteger big = new BigInteger("0");
		BigInteger value = new BigInteger("0"); 
		value.add(BigInteger.valueOf(0));
		do
		{
			line = reader.nextLine();
			
			value = value.add(add(line,big));
		}
		while(Integer.parseInt(line) == 0);
		
			
		System.out.println(value);
	}
	
	public static BigInteger add(String in,BigInteger big)
	{
		
		return;
	}

}
