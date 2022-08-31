package dsaNotes.algo;

public class PrefixSum {

	public static void main(String[] args) {

		/*
		 * Prefix Sum array we make for uslity find out the range sum of given indexes
		 * In prefix sum we make cumulative sum that index
		 * 
		 * for example
		 * 
		 * overs[1, 2, 3, 4, 5, 6, 7, 8, 9] score[2, 8, 24, 30, 45, 50, 57, 67]
		 * 
		 * So we easily find out score b/w two overs [4, 6] => 45 -24
		 * 
		 */

		// code of prefix sum array
		// N==5
		
		int[] arr = { 2, 8, 24, 30, 45, 50, 57, 67 };
		int[] ps = new int[arr.length];
		ps[0] = arr[0];

		for (int i = 0; i < arr.length; i++) {
			ps[i] = ps[i - 1] + arr[i];
		}

	}
}
