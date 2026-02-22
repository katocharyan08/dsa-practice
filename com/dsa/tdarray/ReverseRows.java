package com.dsa.tdarray;
//rows order reverse
import java.util.Arrays;

public class ReverseRows {
public static void main(String[] arrgs) {
	int[][] arr = {{12,34,55,85},
        {74,29,4},
         {71,22}
       };
	reverseRowElement(arr);
	System.out.print(Arrays.deepToString(arr));
}
//Task 1 - completed
  static void reverseOrder(int[][] arr) {

		int s = 0;
		int e = arr.length - 1;
		while(s < e) {
			//swap
			int[] temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
  }
  //Task 2 - incomplete
  static void reverseRowElement(int[][] arr) {
	 
	  for(int i = 0; i < arr.length; i++) {
		  int start = 0;
		  int end = arr[i].length;
		  for(int j = start; j < end / 2 ; j++) {
			  //swap
			  int temp = arr[i][j];
			      arr[i][j] = arr[i][end - 1 - j]; 
			      arr[i][end- 1- j] = temp;
		  }
	  }
  }
}























