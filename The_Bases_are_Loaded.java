import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class The_Bases_are_Loaded {

	public static void main(String[] args) {
	 ArrayList<String> input;
		input = getInput();
		for(String i: input)
		{
			//System.out.println(i);
			outPut(i);
		
	}
	
	public static void outPut(String i)
	{
		//List<String> a = Arrays.asList(i.split("  "));
		ArrayList<String> a = new  ArrayList<String>(Arrays.asList(i.split("\\s+")));
		//a.remove(" ");
		//a.removeAll(Collections.singleton(""));
		for(int n=0; n<a.size();n++)
		{
			if(a.get(n).isEmpty())
				a.remove(n);
		}
		int f = convert(a.get(0));
		int s = convert(a.get(1));
		//a.removeAll(Collections.singleton(null));
		/*for(int n=0; n<a.size();n++)
		{
			System.out.println(a.get(n));
		}*/
	}
	
	public static int convert(String num)
	{
		if(num.length()<2) //check if num contain more than one char
		{
			int c = num.charAt(0);
			if((c>64)&&(c<91))//check if c is an alphabet
			{
				 c = c-55; //conver ascii number to base 10
				 int base = c+1;
				 return Base10(c,base);
			}
			else
			{
				if(c==0)
				{
					 c =  c-48; //convert ascii number to base 10
					 return Base10(c,base);
				}
					
			}
		}
		else
		{return Base10(num,num.substring(num.length()-2));}
	}
	
	//public static int Base10()
	public static ArrayList<String> getInput()
	{
		ArrayList<String> input = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String a;
		do
		{
			a = reader.nextLine();
			input.add(a);
		}while(checkForEnd(a));
		return input;
	}
	
	public static boolean checkForEnd(String a)
	{
		int num = 0;
		for(int i=0; i < a.length();i++)
		{
			if(a.charAt(i) == '0')
				num++;
		} 
		
		return num != 2;
	}

}
