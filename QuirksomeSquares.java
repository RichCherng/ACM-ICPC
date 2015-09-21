import java.util.Scanner;
import java.util.Stack;


public class QuirksomeSquares {

	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		String read;
		while(reader.hasNext()){
			// Create a string with "9" the lenght of digit/n
			if((read = reader.nextLine()) == null)
				break;
			int digit = Integer.parseInt(read);
			String d = "";
			//add "9" into the string n times
			for(int i = 0; i < digit; i++){
				d += "9";	
			}
			Stack<String> output = new Stack<String>();
			while(Integer.parseInt(d) >= 0){
				
				checkQuirk(d,output);
				//System.out.println(Integer.parseInt("-1"));
				d = (Integer.parseInt(d) - 1) + "";
				if(Integer.parseInt(d) < 0)
					break;
				//add leading "0"
				for(int ii = digit - d.length(); ii > 0; ii--){
					d = "0"+d;
				}
				
			}
			while(!output.empty())
				System.out.println(output.pop());
		}
		
		/*
		int input;
		while( (input = Integer.parseInt(reader.nextLine())) != 0 ){
			String[] digit = new String[input];
			for(int i =0; i < digit.length; i++){
				digit[i] = "0";
			}
			
		}
		*/
	}
	
	public static void checkQuirk(String num,Stack<String> output){
		int n = Integer.parseInt(num);
		int first = Integer.parseInt(num.substring(0,num.length()/2));
		int last = Integer.parseInt(num.substring(num.length()/2));
		if( (Math.pow(first + last, 2) == n))
			output.push(num);
	}
}
