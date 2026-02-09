

import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
           // int [][] arr = new int[3][4];
           int [][] arr = {
                   {1,2,3,56,677},
                   {4,5,6},
                   {7,8,9,10}
           };

            // for (int[] arr1 : arr) {
            //     for (int col = 0; col < arr1.length; col++) {
            //         arr1[col] = in.nextInt();
            //     }
            // }
              
              // for(int row = 0 ; row<arr.length;row++){
              //   for(int col = 0 ; col < arr[row].length;col++){
              //       System.out.print(arr[row][col] + ",");
              //   }
              //   System.out.println();        
              // }
        for(int row = 0 ; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    //    for(int[] row : arr){
    //        System.out.println(Arrays.toString(row));
    //    }
    // }
}
}
}
