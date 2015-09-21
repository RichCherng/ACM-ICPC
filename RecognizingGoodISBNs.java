import java.util.Scanner;


public class RecognizingGoodISBNs {
	
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		while(read.hasNext()){
			String input = read.nextLine();
			input.replaceAll("\\s+","");
			String org = input;
			input.replaceAll("-", "");
			char[] num = input.toCharArray();
			System.out.println(input);
			
			//int count = 0;
			/*for(char i:input.toCharArray()){
				count++;
				if(count > 10){
					num = new char[1];
					break;
				}
				num[count - 1] = i;
			}*/
			
			//if(num.length > 11){
				//System.out.printf("%s is incorrect", input);

				int sum = 0;
				int[] parSum = new int[10];
				for(int i = 0; i < 9; i++){
					if(Character.isLetter(num[i])){
						System.out.printf("%s is incorrect%n", org);
						break;
					}
					sum += num[i];
					parSum[i] = sum;
				}
				String temp = num.toString().substring(10);
				sum = 0;
				if(temp.equals("X")){
					sum += 10;
				}
				else{
					if(Character.isLetter(temp.charAt(0)))
						continue;
					else{
							sum += Integer.parseInt(temp);
						}
				}
				
				for(int i: parSum){
					sum += i;
				}
				
				if(sum % 11 == 0){
					System.out.printf("%s is correct%n", org);
				}
				else
					System.out.printf("%s is incorrect%n", org);
		}
	}
}
