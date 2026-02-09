package com.dsa.mathsfordsa;
//problem : find unique element in duplicate of three in array
//Approach : Bit Counting to add all set bit each time/Bit Masking to store result using OR opreator
//Time complexity : O(32 * n) 
//Space complexity : O(1)
public class OneVsThree {
    public static void main(String[] args) {
        int[] arr = {2,2,5,2};
        System.out.println(uniqueElement(arr));

    }
    static int uniqueElement(int[] arr){
        int result = 0;
        for(int bit = 0;bit < 32;bit++){
            int count = 0;
            for(int nums : arr){
                  if((nums & (1 << bit)) != 0){//for zero don't count bcoz we only want set bit to be counted
                    count++;
                  }
            }
            if(count % 3 == 1){
              result |= (1<<bit);//OR operater to set bit in result
            } 
        }
        return result;
    }
}
