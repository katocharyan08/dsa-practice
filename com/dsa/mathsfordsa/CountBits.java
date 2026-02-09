package com.dsa.mathsfordsa;

public class CountBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num = 4;
		  int count = 0;
		  while(num > 0){
			int ans = num & 1;
			count++;
			num >>= 1;
		  }
		  System.out.println(count);
	}

}
