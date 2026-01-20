package com.dsa.recursion;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
         
    String str = "Edward nathan";
    char[] charArr = str.toCharArray();//built in method
    reverse(charArr,0,charArr.length-1);
    System.out.println(charArr);
    }
//using two pointer and recursion
static void reverse(char[] arr,int start,int end){
    //base case
    if(start >= end){
        return;
    }
    char temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
      reverse(arr, start + 1, end - 1);   
}
}
