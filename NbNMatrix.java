import java.util.Scanner;

public class NbNMatrix {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int N = Integer.parseInt(reader.nextLine());
		
		//Using string
		/*int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < size; i++) {
			String[] line = new String[size];
			line = reader.nextLine().split("\\s+");
			sum1 += Integer.parseInt(line[i]);
			sum2 += Integer.parseInt(line[(size - 1) - i]);
		}
		*/
		
		//use only int
		int sum1 = reader.nextInt();
		
		int sum2 = 0;
		for(int i = 1; i < N * N; i++){
			int num = reader.nextInt();
			if(i % (N+1) == 0)
				sum1 += num;
				
			
			if(i % (N-1) == 0 && i != (N*N)-1)
				sum2 += num;
			
		}
		System.out.println(Math.abs(sum1 - sum2));
	}
}
