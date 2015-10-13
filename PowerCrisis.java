import java.util.Scanner;

class aout {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		String read;
		int[] regions;
		int numRegion,regionIndex,m,countOff,count;

		// Read
		while (!(read = reader.nextLine()).equals("0")) {
			regions = new int[Integer.parseInt(read)];
			numRegion = Integer.parseInt(read);
			m = 1;

			// Until meet the requirement
			while (true) {
				//First region is the first to be off
				regions[0] = 1;
				regionIndex = 1;
				countOff = 1;	
				count = 0;
				regionIndex = 0;
				// try
				while (countOff != numRegion) {
					//System.out.println("try");
					//Go through each POWERED Regions and skip off regions
					while(count != m){
						//System.out.println("Running");
						regionIndex = (++regionIndex) % numRegion;
						//If not already off, turn off else keep counting
						if(regions[regionIndex] == 0){
							//regions[regionIndex] = 1;
							count++;
							//countOff++;
						}
					}
					//Turn off 
					regions[regionIndex] = 1;
					countOff++;
					count = 0;
					//region 13th should be last, break when regions 13th is off
					if(regions[12] == 1){
						break;
					}
				}
				if(countOff == numRegion){
					System.out.println(m);
					break;
				} else{
					m++;
				}
				// reset array
				regions = reset(regions);
				
			}

		}

	
	}
	
	public static int[] reset(int[] regions) {
		int[] reset = regions;
		for(int i = 0; i < regions.length; i++){
			reset[i] = 0;
		}
		return reset;
	}
}
