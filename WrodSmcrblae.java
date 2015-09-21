import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Leaf
 *
 */
public class WrodSmcrblae {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File(args[0]));
		int num = Integer.parseInt(reader.nextLine());
		ArrayList<String> words = new ArrayList<String>();
		String n = "";
		int temp = num;
		while(temp > 0)
		{
			words.add(reader.nextLine());
			temp--;
		}
		while(reader.hasNextLine())
		{
			unscramble(words,reader.nextLine());
			System.out.println();
		}
		
		
		//System.out.println(words.get(0));
		

	}
	
	public static void unscramble(ArrayList<String> words,String n)
	{
		ArrayList<String> paragraph  = new ArrayList<String>(Arrays.asList(n.split("\\s+")));
		for(int i=0; i<paragraph.size();i++)
		{
			String word = paragraph.get(i);
			for(int ii=0; ii<words.size();ii++)
			{
				String check = words.get(ii);
				if(word.length() ==check.length())   //check same length
				{
					if( (check.charAt(0) == word.charAt(0)) && ( check.charAt(check.length()-1) == word.charAt(word.length()-1))) //check first and last char
					{
						paragraph.set(i, check);
						break;
					}
				}
				
			}
		}
		
		for(String i: paragraph)
		{
			System.out.print(i+" ");
		}
		
	}

}
