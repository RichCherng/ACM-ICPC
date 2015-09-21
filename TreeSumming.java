import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class TreeSumming {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("input.txt"));
		String read = "";
		while(input.hasNextLine())
		{
			String data = input.nextLine();
			read += data;
		}
		System.out.println(read);
	}

}
