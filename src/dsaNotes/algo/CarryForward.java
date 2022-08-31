package dsaNotes.algo;

public class CarryForward {
	public static void main(String[] args) {
       // carry forward technique is used for cumulative sum that position 
	   // that position without using extra space like prefix sum array
	   // this is mostily used sub array sum type of problem
		
	  // example code
	  // return equlibrium index 
		
		int[] arr= {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(solve(arr));
		
	}
	
	public static int solve(int[] A) {
        int sum=0;
        int leftSum=0;

        for(int i=0; i<A.length; i++){
            sum=sum+A[i];
        }

        for(int i=0; i<A.length; i++){
            sum=sum-A[i];

            if(sum==leftSum){
                return i;
            }

            leftSum=leftSum+A[i];
        }

        return -1;
    }
}
