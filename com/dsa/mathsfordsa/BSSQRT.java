//Problem : Find square root of a number using binary search
//time complexity : O(log(n)) and space cmoplexity : O(1)

package com.dsa.mathsfordsa;

public class BSSQRT {
  public static void main(String[] args) {
        int num = 36;
        int precision = 3;
        System.out.printf("%.3f",BinarySearch(num,precision));
  }
    static double BinarySearch(int num , int precision){
        int start = 0;
        int end = num;
        double root = 0.0;
    while(start <= end){
        int mid = start + (end - start)/2;
        if(mid*mid == num){
            root = mid;
        }
        if(mid*mid > num){
             end = mid - 1;
        }
        else{
            start = mid + 1;
        }
    }
    double incr = 0.1;
    for(int i = 0;i < precision;i++){
        while(root*root <= num){
            root = root + incr;
        }
        root -= incr;
        incr /= 10;
    }
    return root;
}
}