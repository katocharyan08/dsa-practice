package com.dsa.pattern;

public class _12 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(1 - (i+j)%2 + " ");
            }
            System.out.println();
        }
    }
}
