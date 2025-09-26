package com.intro;

public class q1{
    public static void main(String[] args){
        //testcase1
                int arr[] = {1,2,3,4,5,6};
        //testcase2
             // int arr[] = {10,20,30,40,50,60,70};
             int evenSum = 0;
             int oddSum = 0;

        for(int i = 0;i<=arr.length;i++){
            
            evenSum = evenSum + arr[2*i];
            
            oddSum = oddSum + arr[2*i + 1];
        }
        System.out.println("even sum : "+evenSum);
        System.out.println("odd sum : "+oddSum);
    }
}


