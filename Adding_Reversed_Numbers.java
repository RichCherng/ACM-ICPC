import java.util.Scanner;

public class Adding_Reversed_Numbers {

	public static void main(String[] args){

		Scanner reader = new Scanner(System.in);
		int N = Integer.parseInt(reader.nextLine());

		String in;
		int sum;
		String[] nums;
		for(int i = 0; i < N; i++){
			in = reader.nextLine();
			nums = in.split("\\s++");

			nums[0] = reverse(nums[0]);
			nums[1] = reverse(nums[1]);
			sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			System.out.println(reverse(sum+""));
		}
	}

	public static String reverse(String s){
		String re = "";
		for(int i = s.length(); i > 0; i--){
			re += s.charAt(i-1);
		}

		return Integer.parseInt(re)+"";
	}
}
