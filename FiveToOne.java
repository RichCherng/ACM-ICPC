import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class FiveToOne {
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
		float winning = (float)Integer.parseInt((line.get(0)));
		float losing = (float)Integer.parseInt((line.get(1)));
		float i = 2;
		float min = losing;
		float ratio;
		if(min > winning)
			ratio = winning/min;
		else
			ratio = min/winning;
		while(getP(ratio*i)>.01)  // while the decimal value is greater than 1% of the number
		{
			i += .001;
		}
		//String str = new Double(your_double_number).toString().subString(0,str.indexOf('.'));
		//double v = Double.valueOf(str);
		
		System.out.println(i +"cut"+ratio*i);
	}
	
	public static float getP(float r)
	{
		String str = new Float(r).toString();
		str = str.substring(0,str.indexOf('.'));
		float v = Float.valueOf(str);
		if(r < 1)
			return 1;
		else
			return (r-v)/v;
	}
	
}
