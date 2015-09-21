import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class WordLock {
	static String[] config = new String[5];
		public static void main(String[] args)
		{
			Scanner reader = new Scanner(System.in);
			for(int i = 0; i<5; i++)
			{
				config[i] = reader.nextLine();  // put lock configuration into array length of 5
			}
			ArrayList<String> input = new  ArrayList<String>();
			String line;
			while(!((line = reader.nextLine()).isEmpty()))  //check until there is an empty line
			{
				input.add(line);
			}
			for(String i :input)
			{
				System.out.println(check(i));  // check() = check if the word is valid
			}
		}
		
		public static String check(String in)
		{
			boolean check = true;                //set condition to true
			for(int i=0; i<in.length(); i++ )
			{
				int t = config[i].indexOf(in.charAt(i));
				if(t==-1)
					check = false;
			}
			if(check)
				return "Valid";
			else
				return "Invalid";
		}
}
