import java.util.ArrayList;


public class UglyNumber {
	public static void main(String[] args)
	{
		int count =2;
		int num = 2;
		int pos = 2;
		while(count <= pos)
		{
			if(checkP(num))  //return true if it prime factor of 2,3,5
			{
				count++;
			}
			num++;
		}
		
		System.out.println("The"
				+ " "+pos+"'th ugly number is "+(num-1));
		//System.out.println(checkP(5));
	}
	
	public static boolean checkP(int num)
	{
		/*ArrayList<Integer> factor = new ArrayList<Integer>();
		factor.add(2);
		factor.add(3);
		factor.add(5);
		*/
		boolean m2 = (num%2 > 1);
		boolean m3 = (num%3 > 1);
		boolean m5 = (num%5 > 1);
		if(m2 || m3 || m5)
		{
			return false;
		}
		/*while(num%2 == 0)
		{ num = num /2;}
		while(num%3 == 0 && (num != 0))
		{num = num/3;}
		while(num%5 ==0 && (num!=0))
		{num = num/5;} */
		
		while(num > 1)
		{
			if((num%2) == 0)
			{
				//factor.add(2);
				while(num%2 == 0)
				{num = num/2;}
			}
			else
			{
				if((num%3) == 0)
				{
					//factor.add(3);
					num = num/3;
				}
				else
				{
					if((num%5)==0)
					{
						//factor.add(5);
						num = num/5;
					}
					else
					{	
						return false;
					}
				}
			}
		}  
		return num==0;
	}

}
