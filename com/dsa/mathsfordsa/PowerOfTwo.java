package com.dsa.mathsfordsa;
//problem : find the given number is power of two or not.
//Intuition : brute force fails for large numbers.
//Approach : Use n & (n-1) to eliminate right most set bit of number (n).
// If reuslt equal to zero ,then number is power of two
//Time complexity : O(1) and Space complexity : O(1)
public class PowerOfTwo {
    public static void main(String[] args) {
         int num = 7;
        //optimal way by eliminating rigth most set bit ,
        // and the number whose power of two has only one set bit
         if((num > 0 && (num & (num - 1)) == 0)){
             System.out.println("number is power of two");
         }
         else {
            System.out.println("not power of two");
         }
        

         //brute force 
    //     if(num > 0){
    //     int count = 0;
    //     for(int i = 0 ;i < 32;i++){
    //       int mask = num & (1 << i);
    //        if(mask != 0){
    //         count++;
    //        }
    //     }
    //     if(count == 1){
    //         System.out.println("power of two");
    //     }
    //     else{
    //         System.out.println("not power of two");
    //     }
    // }
    }
}
