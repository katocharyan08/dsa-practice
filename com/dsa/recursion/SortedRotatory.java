package com.dsa.recursion;
//Array is sorted in circular motion ,but not linearly so we also have to compare first adn last element
public class SortedRotatory {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(check(arr, 0, 0));
        
    }
    static boolean check(int[] arr , int index, int count){
       // basecase
        if(index == arr.length){
           return true;
        }
      if(arr[index] > arr[(index + 1) % arr.length]){
        count++;
        //count check
        if(count>1) return false;
      }
       return check(arr, index + 1,count);
    }
}
