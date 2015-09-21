import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String line;
		ArrayList<String> input = new  ArrayList<String>();
		while(reader.hasNextLine())  //check until there is an empty line  .. not working when run in command promt
		{
			line = reader.nextLine();
			input.add(line);
		}
		
		for(String i: input)
		{
			System.out.println(checkForPalindrome(i));
		}
	}
	
	public static String checkForPalindrome(String a)
	{
		String check = "";
		boolean re = true;
		for(int i = 0; i < a.length(); i++)
		{
			if(((a.charAt(i) > 64) && (a.charAt(i) < 91)) || ((a.charAt(i)>96)&&(a.charAt(i)<123)))
				check += a.charAt(i);
		}
		check = check.toLowerCase();
		for(int i =0; i < check.length()/2; i++)
		{
			if(check.charAt(i) != check.charAt(check.length()-(1+i)))
			{
				re = false;
			}
		}
		
		if(re)
			return "palindrome";
		else
			return "not a palindrome";
	}

}
