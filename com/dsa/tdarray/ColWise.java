package com.dsa.tdarray;

public class ColWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{12,34,55,85,133},
                       {74,29,4,33,322},
                        {71,22,43,55,77}
                      };
		int row = arr.length;
		int col = arr[0].length;//for jagged array this length is false ,because row length are not fix
		for(int i = 0;i < col; i++) {
			for(int j = 0 ;j <  row; j++ ) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
       
	}

}
