import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class NumberMaze {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int[][] maze;
		int NUM_MAZE = Integer.parseInt(reader.nextLine());
		for(int i = 0; i < NUM_MAZE; i++){
			int row = Integer.parseInt(reader.nextLine());
			int col = Integer.parseInt(reader.nextLine());
			maze = new int[row][col];
			for(int ii = 0; ii < maze.length;ii++){
				String inputMaze = reader.nextLine();
				ArrayList<String> reading = new ArrayList<String>(Arrays.asList(inputMaze.split(" ")));
				for(int iii = 0; iii < maze[0].length; iii++){
					maze[ii][iii] = Integer.parseInt(reading.get(iii));
				}
			}
			
			//traverse the maze
			for(int ii = 0; ii < maze.length;ii++){
				for(int iii = 0; iii < maze[0].length; iii++){
					if(( iii - 1 >= 0) && (ii - 1 >= 0)){ // check left and top
						if(maze[ii][iii - 1] < maze[ii - 1][iii]){ //if left is less than top
							maze[ii][iii] += maze[ii][iii-1];
						} else {
							maze[ii][iii] += maze[ii - 1][iii];
						}
					} else if (( iii - 1 > 0)){ // left exist
						maze[ii][iii] += maze[ii][iii-1];
					} else if ((ii - 1 > 0)){ //top exist
						maze[ii][iii] += maze[ii - 1][iii];
					}
				}
				
			}
			
			for(int ii = 0; ii < maze.length;ii++){
				for(int iii = 0; iii < maze[0].length; iii++){
					System.out.print(maze[ii][iii] + "\t");
				}
				System.out.println();
			}
			
			System.out.println(maze[maze.length-1][maze[0].length-1]);
		}
		
		
	}
}
