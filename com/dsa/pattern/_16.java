package com.dsa.pattern;

public class _16 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <=n; i++){
            //spaces
            for(int j = n-i; j>0;j--){
                System.out.print("  ");
            }
            //numbers
            for(int k = 0;k < 2*i - 1;k++){
                if(k < i){
                    System.out.print((char)('A' + k )+ " ");
                }
                else{
                    System.out.print((char)('A' + 2*i -2 - k)+" ");
                }
            }
            System.out.println();
        }
    }
}
