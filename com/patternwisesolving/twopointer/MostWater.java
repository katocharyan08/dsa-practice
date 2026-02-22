package com.patternwisesolving.twopointer;

//Problem : Container with most water.
//Intuition : we need to find two things :
//            1.Water store 
//            2.Compare Max. Water with l
//Approach : Two Pointer(opposite direction), Condition : movement followed by minimum height
//Time complexity : O(n) and Space complexity : O(1) for two pointer
public class MostWater {

	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		System.out.println(bruteForce(arr));
		System.out.println(mostWater(arr));

	}
	//brute force find through each container
	//T.C : O(n^2) and S.C : O(1)
	static int bruteForce(int[] arr) {
		int maxWater = 0;
	  for(int i = 0; i < arr.length; i++ ) {
		  for(int j = i + 1; j < arr.length; j++ ) {
			  //water store 
			  int weight = j - i;
			  int height = Math.min(arr[i], arr[j]);
			  int area = weight * height;
			  //compare
			  maxWater = Math.max(maxWater,area); 
		  }
	  }
	  return maxWater;
	}
	//Optimal solution
	static int mostWater(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int maxWater = 0;
	  while(left < right) {
		  int weight = right - left;
		  int height = Math.min(arr[left],arr[right]);
		  int area = weight * height;
		  maxWater = Math.max(maxWater, area);
		  if(arr[left] < arr[right]) {
			  left++ ;
			  }else{
				  right--;
			  }  
		  }
	  return maxWater;
	}
}
