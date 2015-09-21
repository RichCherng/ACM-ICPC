import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Ants {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		ArrayList<String> line = new  ArrayList<String>(Arrays.asList(input.split("\\s+")));
		ArrayList<Integer> position = new ArrayList<Integer>();
		ArrayList<String> dir = new ArrayList<String>();
		for(int i=0; i < line.size(); i++)
		{
			if(i%2 == 0)
				position.add( Integer.parseInt(line.get(i))  );
			else
				dir.add(line.get(i));
				
		}
		int timer = 1;
		int temp;
		int c;
		while(dir.size()>0)
		{
			for(int a=0; a<dir.size(); a++)
			{
				if(dir.get(a).equals("L"))
				{
					temp = position.get(a)-1;
					c = position.indexOf(temp);
					if(c > 0)
						dir.set(a,"R");
					position.set(a,temp);
				}
				else
				{
					temp = position.get(a)+1;
					c = position.indexOf(temp);
					if(c>0)
						dir.set(a, "L");
					position.set(a,temp);
				}
				c = -1;
			}
			int fin = position.indexOf(0);
			int fin2 = position.indexOf(100);
			if(fin != -1)
			{
				position.remove(fin);
				dir.remove(fin);
			}
			if(fin2 != -1)
			{
				position.remove(fin2);
				dir.remove(fin2);
			}
			
			
			timer++;
			
		}
		System.out.println(timer);
	}

}
