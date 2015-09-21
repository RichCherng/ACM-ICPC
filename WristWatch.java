
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class WristWatch {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner reader = new Scanner(new File(args[0]));
		String line;
		while(reader.hasNextLine())  //check until there is an empty line  .. not working when run in command promt
		{
			line = reader.nextLine();
			System.out.println(line);
			calenderDate(line);
		}
	}
	
	public static void calenderDate(String in)
	{
		ArrayList<String> expression = new  ArrayList<String>(Arrays.asList(in.split("\\s+")));
		ArrayList<String> date = new  ArrayList<String>(Arrays.asList(expression.get(0).split("/")));
		
		boolean leap = (Integer.parseInt(date.get(2))%4 == 0);
		
		//System.out.println(expression.size());
	}
	
	public static int gap(int month, int date, int wdate,boolean leap)
	{
		int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
		int count = 0;
		for(int i=0; i < 12; i++)
		{
			for(int ii = 0; ii <mon[i]; ii++)
			{
				
			}
		}
	}
}
