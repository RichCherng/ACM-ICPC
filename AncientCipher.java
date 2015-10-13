import java.util.ArrayList;
import java.util.Scanner;


public class AncientCipher {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		char[] abc = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'};
		
		while(reader.hasNextLine()){
			char[] cipher = reader.nextLine().toCharArray();
			char[] mes = reader.nextLine().toCharArray();
			
			ArrayList<Character> c = new ArrayList<Character>();
			ArrayList<Character> m = new ArrayList<Character>();
			if(cipher.length == mes.length){
				for(int i = 0; i < cipher.length; i++){
					if(!c.contains((Character)cipher[i])){
						c.add(cipher[i]);
					}
					if(!m.contains((Character)mes[i])){
						m.add(mes[i]);
					}
				}
			}
			
			String res = m.size() == c.size()? "YES":"NO";
			System.out.println(res);
		}
		
		
		/*while(reader.hasNextLine()){
			char[] cipher = reader.nextLine().toCharArray();
			String mes = reader.nextLine();
			ArrayList<Character> me = new ArrayList<Character>();
			for(int i = 0; i < mes.length(); i ++){
				me.add(mes.charAt(i));
			}
			
			
			boolean flag = false;
			
			for(int a = 0; a < 26; a++){
				
				for(int i = 0; i < cipher.length; i++){
					cipher[i] = abc[(cipher[i] - 65 + 1)%26];
				}
				
				for(char i: cipher){
					System.out.print(i);
				}
				System.out.println();)
				
				ArrayList<Character> c = new ArrayList<Character>(me);
				for(int i = 0; i < cipher.length; i++){
					if(c.contains((Character)cipher[i])){
						c.remove((Character)cipher[i]);
					}
				}
				
				if(c.size() == 0){
					flag = true;
					break;
				}
				
				
			}
			if(flag){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}*/
	}
}
