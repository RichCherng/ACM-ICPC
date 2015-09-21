import java.util.Scanner;


public class StateQuater {

	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] cash = {0,0,0,0,0,0,2};
		float[] value = {0.01f,0.05f,0.1f,1.00f,5.00f,10.00f,20.00f};
		/*
		 cash[x] =
		 	  0 = penny
		 	  1 = nickel
		 	  2 = dime
		 	  3 = one
		 	  4 = five
		 	  5 = ten
		 	  6 = twenty
		 */
		String line;
		while(!((line = reader.nextLine()).isEmpty()))  //check until there is an empty line
		{
			cash = transaction(Float.parseFloat(line),cash,value);
		}

	}
	
	public static int[] transaction(float tran,int[] cash,float[] value)
	{
		float coin = tran;
		int quarter = 0;
		while (coin>1.0f)
		{
			coin -= 1.0f;
		}
		for(int i=0; i<cash.length;i++)
		{
			
		}
		return cash;
	}

}
