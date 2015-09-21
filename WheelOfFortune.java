import java.util.ArrayList;
import java.util.Scanner;


public class WheelOfFortune {
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> puzzle = new ArrayList<String>();
	
		while(reader.hasNext())
		{
			String line = reader.nextLine();
			if(line.equals("#####")) //given line stop, start the puzzle input
			{
				while(reader.hasNext()) //put the remaining input into puzzle
				{
					
					puzzle.add(reader.nextLine());
				}
			}
			else 
				words.add(line);
		}
		
		for(String i: puzzle)
		{
			check(words,i);
		}
	
	}
	
	
	public static void check(ArrayList<String> words, String i)
	{
		//check for same length
		ArrayList<String> len = new ArrayList<String>();
		for(String ii:words)
		{
			if(ii.length() == i.length())
			{
				len.add(ii);
				//System.out.println(ii);
			}
		}
		
		boolean ck;
		for( String ii: len)
		{
			ck = true;
			outerloop:
			for(int index = 0; index < i.length(); index++)
			{
				if((i.charAt(index) == ' ') || (i.charAt(index) == '_'))
				{}
				else
				{
					if(i.charAt(index) != ii.charAt(index))
					{
						ck = false;
						break outerloop;
					}
				}
			}
			if(ck)
				System.out.println(ii);
		}
		
		
	}
	
	
}
