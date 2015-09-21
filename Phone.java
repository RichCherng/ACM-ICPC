import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Phone {

	public static void main(String[] args) {

		//ArrayList<Character> Samsung = new ArrayList<Character>(Arrays.asList('1','2','3','5','6','7','8','9','a'));
		Scanner reader = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		String line;
		while(!((line = reader.nextLine()).isEmpty()))
		{
			input.add(line);
		}
		for(String i: input)
			output(i);
	}
	
	public static void output(String a)
	{
		String Samsung = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Blackberry = "0123456789ERTYUIDFGHJKCVBNM";
		Boolean S = true;
		Boolean B = true;
		a = a.replace("-", "");
		for(int i=0; i<a.length();i++)
		{
			int Ts = -1;
			int Tb = -1;
				Ts = Samsung.indexOf(a.charAt(i));
				Tb = Blackberry.indexOf(a.charAt(i));
				if(!(Ts > -1))
					S = false;
				if(!(Tb > -1))
					B = false;
		}
		if(a.length() != 7  || a.length() != 11)
		{
			if(S && B)
			{
				System.out.println("Both");
			}
			else
			{
				if(S)
					System.out.println("Samsung");
				else
				{
					if(B)
						System.out.println("Blackberry");
					else
						System.out.println("Neither");
				}
			}
		}
	}

}
