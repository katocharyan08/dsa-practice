package com.dsa.pattern;

public class _14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <=n; i++){
            //spaces
            for(int j = n-i; j>0;j--){
                System.out.print("  ");
            }
            //numbers
            for(int k = 1;k<=2*i - 1;k++){
                if(k <= i){
                    System.out.print(k + " ");
                }
                else{
                    System.out.print(2*i - k +" ");
                }
            }
            System.out.println();
        }
    }
}
