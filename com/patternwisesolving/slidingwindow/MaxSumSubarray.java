package com.patternwisesolving.slidingwindow;

public class MaxSumSubarray {
    public static void main(String[] args) {
       int[] arr = {4,5,2,-1,8,-4,6};
       int n = arr.length;
       int k = 3;//window size fixed
       System.out.println(maxSum(arr,n,k));
    }
    static int maxSum(int[] arr, int n, int k) {
    	int windowSum = 0;
    	for(int i = 0;i < k; i++) {
    		windowSum += arr[i];
    	}
		int max_sum = windowSum;
    	for(int i = 1; i <= n - k; i++) {
    		windowSum = windowSum + arr[i + k - 1] - arr[i-1];	
			if(windowSum > max_sum) {
    		max_sum = windowSum;
    	}	
    	}
    	return max_sum;
//    	int max_sum = 0;
//    	int sum = 0;
//    	//find first window sum only
//    	for(int i = 0;i < n - k; i++) {
//    		for(int j = i; j <= k-1 +i; j++) {
//    			sum += arr[j];
//    		}
//    		if(sum > max_sum) {
//    			max_sum = sum;
//    		}
//    	}
//    	return max_sum;
    }
}
