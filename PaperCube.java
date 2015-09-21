

import java.util.Scanner;

public class PaperCube {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int test;
		test = Integer.parseInt(reader.nextLine());
		reader.nextLine();
		int[][] grid = new int[6][6];
		String[] input;
		for(int i=0; i<test; i++)
		{
			
			for(int y=0; y<6; y++)
			{
				input = reader.nextLine().split("\\s");
				
				for(int x=0; x<6; x++)
				{
					grid[y][x] = Integer.parseInt(input[x]);
					System.out.print(grid[y][x] + " ");
				}
				System.out.println();
			}
			
			check(grid);
			
			reader.nextLine();
			System.out.println();
			
		}
		

	}
	
	public static boolean check(int[][] in)
	{
		return true;
	}

}
