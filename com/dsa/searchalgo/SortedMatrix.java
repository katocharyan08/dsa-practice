package com.dsa.searchalgo;
import java.util.Arrays;
//taking row case
public class SortedMatrix {
public static void main(String[] args) {
    int[][] arr = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
    System.out.println(Arrays.toString(search(arr, 7)));
}    
   static int[] binarySearch(int[][] matrix, int row, int cStart , int cEnd, int target){
    while(cStart <= cEnd){
        int mid = cStart + (cEnd - cStart)/2;

        if(matrix[row][mid]==target){
            return new int[]{row,mid};
        }
        if(matrix[row][mid] < target){
            cStart = mid + 1;
        }
        else{
            cEnd = mid - 1;
        }
    }
    return new int[]{-1,-1};
   }
   static int[] search(int[][] matrix , int target){
     int row = matrix.length;
     int col = matrix[0].length;//because if matrix was empty

     if(col == 0){
        return new int[] {-1,-1};
     }
     if(row == 1){//apply simple binary search
       return binarySearch(matrix,row,0,col -1,target);
   }

   int rStart = 0;
   int rEnd = row - 1 ;
   int cMid = col/2;//this gonna provide middle column

    // run the loop till 2 rows are remaining 
   while(rStart < (rEnd - 1)){// while this is true it will have more than 2 rows
    int mid = rStart + (rEnd - rStart)/2;
         if (matrix[mid][cMid] == target){
            return new int[]{mid,cMid};
         }
         if(matrix[mid][cMid] < target){//ignore above  rows
              rStart = mid;
         }
         else{//ignore bottom rows
              rEnd = mid;
         }
   }

    //search in 1st part
    if(target <= matrix[rStart][cMid-1]){
       return binarySearch(matrix,rStart,0 ,cMid-1,target);
    }
   
    //search in 2nd part
    if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]){
       return binarySearch(matrix,rStart,cMid+1 ,col-1,target);
    }
    //search in 3rd part
    if(target <= matrix[rStart+1][cMid-1]){
       return binarySearch(matrix,rStart+1,0 ,cMid-1,target);
    }
    //search in 4th part
    else{
        return binarySearch(matrix, rStart + 1 , cMid+1, col-1, target);
    }
   
}

}
 