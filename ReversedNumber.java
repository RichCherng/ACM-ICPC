import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ReversedNumber {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int c = Integer.parseInt(reader.nextLine());
		String[] input = new String[c];
		int e = 0;
		while (c > 0)
		{
			input[e] = reader.nextLine();
			e++;
			c--;
		}
		for(String i : input)
			output(i);
	}
	
	public static void output(String a)
	{
		ArrayList<String> line = new  ArrayList<String>(Arrays.asList(a.split("\\s+")));
		int num1 = Integer.parseInt(reverse(line.get(0)));
		int num2 = Integer.parseInt(reverse(line.get(1)));
		int result = num1 + num2;
		result = Integer.parseInt(reverse(Integer.toString(result)));
		System.out.println(result);
	}
	
	public static String reverse(String n)
	{
		String New = "";
		for(int i=0; i<n.length();i++)
		{
			New += n.charAt(n.length()-(i+1));
		}
		return New;
	}
}
