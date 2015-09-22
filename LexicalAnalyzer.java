import java.util.ArrayList;
import java.util.Scanner;


class aout {

	public static void main(String[] args){
		
		ArrayList<Character> vowel = new ArrayList<Character>();
		//char[] vowel = {'a','e','i','o','u'};
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<String>();
		
		String[] sentence;
		
		String str;
		
		int syllable = 0;
		
		while(reader.hasNextLine()){
			str = reader.nextLine();

			sentence = str.split("\\s++");
			
			for(String i: sentence){
				words.add(i);
			}
		}
		
		
		for(String i: words){
			syllable += count(i,vowel);
		}
		
		System.out.printf("%d %d",words.size(),syllable);

	}
	
	public static int count(String word,ArrayList<Character> vowel){
		
		int count = 0;
		String lWord = word.toLowerCase();
		boolean flag = false;
		for(int i = 0 ; i < word.length(); i++){
			if(vowel.contains(lWord.charAt(i))){
				flag = true;
			}
			else if(flag)
			{
				count++;
				flag = false;
			}
		}
		if(flag)
			count++;
		return count;
	}
}
