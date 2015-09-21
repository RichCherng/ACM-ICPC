import java.util.Scanner;


public class Flateland{
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String[] coord = reader.nextLine().split("//s"); 
		int x = Integer.parseInt(coord[0]);
		int y = Integer.parseInt(coord[1]);
		while(reader.hasNext())
		{
			String[] robot = reader.nextLine().split("//s");
			int xR = Integer.parseInt(robot[0]);
			int yR = Integer.parseInt(robot[1]);
			String or = robot[2];
			int dir = 1;
			switch(or.charAt(0))
			{
				case 'N':
					dir = 0;
					break;
				case 'S':
					dir = 1;
					break;
				case 'E':
					dir = 2;
					break;
				case 'W':
					dir = 3;
					break;
			}
			
			
			String instruction = reader.nextLine();
			String[] orien = {"North","East","South","West"};
			for(int i =0; i<instruction.length(); i++)
			{
				switch(instruction.charAt(i))
				{
					case 'L':
						if(dir == 0)
						{
							dir = 3;
						}
						else
							dir--;
						break;
					case 'R':
						dir = (dir+1)%4;
						break;
					case 'F':
						switch(dir)
						{
							case 0:
								yR++;
								break;
							case 1:
								xR++;
								break;
							case 2:
								yR--;
								break;
							case 3:
								xR--;
								break;
						}
						break;
				}
				
				if(xR > x || xR < 0)
				{
					System.out.printf("%d %d %s",xR,yR,orien[dir]);
				}
			}
		}
		
	}
		

}
