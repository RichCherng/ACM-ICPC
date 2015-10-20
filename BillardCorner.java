import java.util.Scanner;


public class BillardCorner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String[] intArr = line.split("\\s+");
			int x = Integer.parseInt(intArr[0]);
			int y = Integer.parseInt(intArr[1]);
			if(x == 0 && y == 0){
				break;
			}
			Coordinate aCoord = new Coordinate(0,y);
			aCoord.move();
			if(aCoord.hitEdge(x, y)){
				if(aCoord.mX == 0 || aCoord.mX == x){
					aCoord.switchX();
				}
				if(aCoord.mY == 0 || aCoord.mY == y){
					aCoord.switchY();
				}
			}
			while(!aCoord.inCorner(x, y)){
				
				aCoord.move();
				while(!aCoord.hitEdge(x, y)){
					//aCoord.printCoord();
					aCoord.move();
				}
				// Check which edge is hit
				if(aCoord.mX == 0 || aCoord.mX == x){
					aCoord.switchX();
				}
				if(aCoord.mY == 0 || aCoord.mY == y){
					aCoord.switchY();
				}
			}
			if(aCoord.mY == 0 && aCoord.mX == 0){
				System.out.println("Upper Left");
			}
			if(aCoord.mY == 0 && aCoord.mX == x){
				System.out.println("Upper Right");
			}
			if(aCoord.mY == y && aCoord.mX == 0){
				System.out.println("Lower Left");
			}
			if(aCoord.mY == y && aCoord.mX == x){
				System.out.println("Lower Right");
			}
		}
	}
	static class Coordinate {
		int mX,mY;
		int deltaX, deltaY;
		public Coordinate(int xAxis, int yAxis){
			mX = xAxis;
			mY = yAxis;
			deltaX = +1;
			deltaY = -1;
		}
		public void printCoord(){
			System.out.printf("X: %d, Y: %d", mX, mY);
		}
		public void move() {
			mX += deltaX;
			mY += deltaY;
		}
		public void switchX(){
			deltaX = -deltaX;
		}
		public void switchY(){
			deltaY = -deltaY;
		}
		public boolean inCorner(int X, int Y){
			return (mX == X || mX == 0) && (mY == 0 || mY == Y);
		}
		public boolean hitEdge(int X, int Y) {
			return (mX == X || mX == 0 || mY ==0 || mY == Y);
		}
	}
}
