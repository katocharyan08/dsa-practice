package com.dsa.mathsfordsa;

import java.util.Arrays;

public class FlippingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{1,0,0},
				         {0,1,0},
				         {0,0,0}
			            }; 
	  flippingImage(image);
	  System.out.println(Arrays.deepToString(image));
	}
	static int[][] flippingImage(int[][] image) {
		 for(int i = 0; i < image.length; i++) {
			  int end = image[0].length;//not jagged array
			  for(int j = 0; j < (end+1) / 2 ; j++) {
				  //swap
				  int temp = image[i][j]^1;
				      image[i][j] = image[i][end - 1 - j]^1; 
				      image[i][end- 1- j] = temp;
			  }
	    }
		 return image;//return array
	}
	
	}

