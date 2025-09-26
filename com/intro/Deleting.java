package com.intro;
import java.util.*;

public class Deleting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        int n , pos , item ; 
        System.out.println("enter element :");
        n = in.nextInt();
        System.out.println("enter elements :");
        for(int i = 0 ; i<n;i++){
          arr[i] = in.nextInt();
        }
        System.out.println("enter position ");
        pos = in.nextInt();
        
        item = arr[pos];
        if(pos<0 || pos>=n){
            System.out.println("invalid pos");
        }
        else{
            for(int j = pos;j<=n-1;j++){
                  arr[j] = arr[j+1];
            }
            n--;
            System.out.println("array after deletion ");
            for(int i = 0 ; i<n;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
