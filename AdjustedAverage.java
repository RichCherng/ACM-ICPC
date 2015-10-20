import java.util.Scanner;


public class AdjustedAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[] inputArr = sc.nextLine().split("\\s+");
			//System.out.print(inputArr.length + " ");
			Double[] numArr = new Double[inputArr.length];
			double max = 0, min = 0, sum = 0;
			for(int i = 0; i < numArr.length; i++){
				numArr[i] = Double.parseDouble(inputArr[i]);
				//System.out.print(numArr[i] + " ");
				sum +=  numArr[i];
				if(i == 0){
					max = numArr[i];
					min = numArr[i];
				}else {
					if(numArr[i] > max){
						max = numArr[i];
					}
					if(numArr[i] < min){
						min = numArr[i];
					}
				}
			}
			sum = sum - min - max;
			System.out.printf("\n%d %.2f %.2f %.2f",numArr.length, min, max, sum/(numArr.length - 2));
		}
	}

}
