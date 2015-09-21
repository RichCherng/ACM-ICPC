import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class StampAndEvvelopSize {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(reader.nextLine() != "0")
		{
			int S = Integer.parseInt(reader.nextLine());
			int N = Integer.parseInt(reader.nextLine());
			String[] input = new String[N];
			for(int i=0; i<N;i++)
			{
				input[i] = reader.nextLine();
			}
			for(String n:input)
			{
				outPut(n);   // save the output in global varieble to be output later.
			}
		}
		
		public static void outPut(String line)
		{
			ArrayList<String> temp = new  ArrayList<String>(Arrays.asList(line.split("\\s+"))); //seperate string into array of element

		}
		
		

}
