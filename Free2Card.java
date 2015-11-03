import java.util.Scanner;


public class Free2Card {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String input = "";
		
		while(reader.hasNextLine()){
			input += reader.nextLine();
		}
		
		String[] line = input.split("!");
		for(String i: line){
			String temp = i;
			String word;
			char[] output = new char[80];
			for(int a = 0; a < 80; a++){
				output[a] = ' ';
			}
			boolean number = true;
			int position = 0;
			if(temp.charAt(0) == ' '){
				temp = temp.substring(1);
			}
			while(temp.length() > 0){
				if(number){
					String num = temp.substring(0,temp.indexOf(' '));
					position = Integer.parseInt(num);
					temp = temp.substring(temp.indexOf(' ')+1);
					number = false;
				} else {
					char del = temp.charAt(0);
					temp = temp.substring(temp.indexOf(del)+1);
					
					word = temp.substring(0,temp.indexOf(del));
					
					temp = temp.substring(temp.indexOf(del) + 1);
					
					if(temp.length() > 0){
						temp = temp.substring(1);
					}
					number = true;
					for(int a = 0; a < word.length(); a++){
						if(a + position > 80)
							break;
						output[a+position-1] = word.charAt(a);
					}
				}
			}
			System.out.println(output);
			
		}
	}

}
