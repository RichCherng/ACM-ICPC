import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class aout {
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int num = Integer.parseInt(reader.nextLine());
		for(int i=0; i<num; i++)
		{
			outPut(reader.nextLine());
		}
	}
	
	public static void outPut(String in)
	{
		ArrayList<String> line = new  ArrayList<String>(Arrays.asList(in.split("\\s+")));
		int num_One = Integer.parseInt((new StringBuilder(line.get(0)).reverse().toString()));
		int num_Two = Integer.parseInt((new StringBuilder(line.get(1)).reverse().toString()));
		int sum = num_One + num_Two;
		sum = Integer.parseInt((new StringBuilder(Integer.toString(sum)).reverse().toString()));
		System.out.println(sum);
	}

}
