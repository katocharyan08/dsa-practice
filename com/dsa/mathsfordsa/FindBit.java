package com.dsa.mathsfordsa;
//problem : find ith bit 
//pattern : Bit masking with AND
/*approch : shift 1 by ith bit (as it follow 0-based indexing) and 
then mask is created after that Bit mask with AND*/
//Time complexity : O(1) + O(1) = O(1) and Space complexity : O(1)
//1. shift operation O(1)
//2. AND operation O(1)

public class FindBit {
    public static void main(String[] args) {
       int result = findBit(78,4);
       if(result != 0){

        
        System.out.println("ith bit is one");
       }
       else{
        System.out.println("ith bit is zero");
       }
    }
    static int findBit(int num,int bitPos){
        //0-based indexing
        //doing mask of 1,because it let us find that particular ith bit
            int mask = 1 << bitPos;//sfift left by 4 zero as it is 0-based indexing 
            int result = num & mask;
            return result;
        }
}
