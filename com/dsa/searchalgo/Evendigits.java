package com.dsa.searchalgo;

public class Evendigits{
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
       System.out.println(findnumbers(nums)); 
       
    }
      //function for count the nums with even digits
      static int findnumbers(int[] nums){
        int count= 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
      }
      //for checking even or not
      static boolean even(int num){
        int numofdigits = digits(num);
         return numofdigits % 2 == 0;

      }
      //to count no. of digits
      static int digits(int num){
        if(num == 0){
            return 1;
        }
        //for negative num
        if (num<0){
             num = num * (-1);
        }
        //for count 
        int count = 0;
        while (num>0){
            count++;
            num = num%10;
        }
        return count;
      }
}