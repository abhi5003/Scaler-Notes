package dsaNotes.algo;

public class KadaneAlog {
	public static void main(String[] args) {
       
		// Kadnne alogrithm is used for Max Sum Contiguous Subarray
		
		int[] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(final int[] A) {
        int sum=0;
        int max=Integer.MIN_VALUE;;
        int n=A.length;

        for(int s=0; s<n; s++){           // Kadane Algorithm

            sum+=A[s];

            if(sum>max){
               max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        return max;
    }
}
