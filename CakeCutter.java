import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class CakeCutter {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		while(reader.hasNext())
		{
			String a = reader.nextLine();
			ArrayList<String> line = new ArrayList<String>(Arrays.asList(a.split("\\s+")));
			 //System.out.println(reader.nextLine());
			outPut(line);
		} 
	}
	
	public static void outPut(ArrayList<String> line)
	{
		int[] x = new int[4];
		int[] y = new int[4];
		for(int i=0; i< line.size(); i += 2)
			x[i/2] = Integer.parseInt(line.get(i));
		for(int i = 1; i< line.size(); i+=2)
			y[(i-1) /2 ] = Integer.parseInt(line.get(i));
	}
}
