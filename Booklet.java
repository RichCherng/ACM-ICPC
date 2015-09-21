import java.util.Scanner;


public class Booklet {
	
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		int input;
		while((input = reader.nextInt()) != 0){
			int sheet = (int) Math.ceil(input/4.0);
			int[] booklet = new int[sheet*4];
			//System.out.println(booklet.length);
			int count = 1;
			for(int i = 1; i <= input; i = i + 4){
				booklet[i] = count;
				count++;
				if(count > input)
					break;
				if(i+1 < booklet.length){
					booklet[i+1] = count;
					count++;
				}
			}
			if(count <= input){
				booklet[booklet.length-1] = count;
				count++;
			}
			for(int i = booklet.length-4; i >= 0; i = i - 4){
				if(count > input)
					break;
				booklet[i] = count;
				count++;
				if(count > input)
					break;
				booklet[i-1] = count;
				count++;
			}
			String[] output = new String[sheet*4];
			for(int i = 0; i < booklet.length;i++){
				if(booklet[i] == 0){
					output[i] = "Blank";
				}else{
					output[i] = Integer.toString(booklet[i]);
				}
			}
			System.out.printf("Printing order for %d pages:%n",input);
			for(int i = 0; i < output.length; i = i + 2){
				if(i%4 < 2){ //front page
				System.out.printf("Sheet %d, front:%s,%s%n",(int) Math.ceil((i+1)/4.0),output[i],output[i+1]);
				}else{ //back page
					if(input > 1)
					System.out.printf("Sheet %d, back:%s,%s%n",(int) Math.ceil((i+1)/4.0),output[i],output[i+1]);
				}
			}
		}
	}
}
