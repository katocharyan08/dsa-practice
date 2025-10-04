package com.intro;
import java.util.Scanner;
public class Inserting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int j,k,n,ITEM;
        System.out.println("eneter no. of elements :");
        n =sc.nextInt();//length
        System.out.println("enter" + n + "elements");
        for(int i = 0;i < n;i++){
         arr[i] = sc.nextInt();
  }
  System.out.println("enter element to be insert ");
        ITEM = sc.nextInt();//item to insert
        System.out.println("enter position");
        k = sc.nextInt();//postion
        j = n-1;//intialise counter
System.out.println("before inserting ");
    for(int i = 0;i < n;i++){
    System.out.println(arr[i]);
  }
    while(j>=k){
      arr[j+1] = arr[j];
      j--;
    }
        arr[k] = ITEM;
        n++;
System.out.println("array after inserting element : ");
  for(int i = 0;i < n;i++){
    System.out.println(arr[i]+" ");
  }
  
sc.close();
}
}