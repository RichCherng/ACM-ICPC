//import java.awt.List; Dont use this library

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class aout {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		String read;
		List<Integer> regions;
		int numRegion, regionIndex, m, countOff, count;

		// Read
		while (!(read = reader.nextLine()).equals("0")) {

			numRegion = Integer.parseInt(read);
			//regions = reset(numRegion);

			m = 0;

			// Until meet the requirement
			do{
				m++;
				regions = reset(numRegion);
				count = 1;
				// while(regions.size() > 1){
				for (Iterator<Integer> iterator = regions.iterator(); regions.size() > 1;) {
					int n = iterator.next();
					if (count < m) {
						count++;
					} else {
						count = 1;
						if (n == 13)
							break;
						iterator.remove();
					}

					if (!iterator.hasNext()) {
						iterator = regions.iterator();
					}
				}
				
				// }

				
				/*
				 * //First region is the first to be off regions[0] = 1;
				 * regionIndex = 1; countOff = 1; count = 0; regionIndex = 0;
				 */

				/*
				 * // try while (countOff != numRegion) {
				 * //System.out.println("try"); //Go through each POWERED
				 * Regions and skip off regions while(count != m){
				 * //System.out.println("Running"); regionIndex =
				 * (++regionIndex) % numRegion; //If not already off, turn off
				 * else keep counting if(regions[regionIndex] == 0){
				 * //regions[regionIndex] = 1; count++; //countOff++; } } //Turn
				 * off regions[regionIndex] = 1; countOff++; count = 0; //region
				 * 13th should be last, break when regions 13th is off
				 * if(regions[12] == 1){ break; } }
				 */

				/*
				 * if(countOff == numRegion){ System.out.println(m); break; }
				 * else{ m++; } // reset array regions = reset(regions);
				 */
			}while ((regions.get(0) != 13) || (regions.size() != 1));
			System.out.println(m);

		}

	}

	/*
	 * public static int[] reset(int[] regions) { int[] reset = regions; for(int
	 * i = 0; i < regions.length; i++){ reset[i] = 0; } return reset; }
	 */

	// Start from 2nd region because 1st region is always off first
	public static List<Integer> reset(int n) {
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 1; i < n; i++) {
			a.add(i + 1);
		}
		return a;
	}
}
