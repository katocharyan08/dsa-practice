package com.dsa.recursion;

import java.util.ArrayList;

public class LiearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        System.out.println(findFromFirst(arr, 18, 0));
        System.out.println(findFromLast(arr, 18, arr.length-1));
        System.out.println(find(arr, 18, 0));
        findAllIndex(arr,18, 0);
         System.out.println(list);
    }
    static int findFromFirst(int[] arr, int target,int i){
        if(arr.length == i){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
          return findFromFirst(arr, target, i+1);
}
        static int findFromLast(int[] arr, int target,int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
          return findFromFirst(arr, target, i-1);
}
        static boolean find(int[] arr, int target,int i){
        if(arr.length == i){
            return false;
        }
        return arr[i] == target || find(arr, target, i+1);
}
        static ArrayList<Integer> list = new ArrayList<>();
        static void findAllIndex(int[] arr, int target,int i){
            if(arr.length == i){
                return;
            }
            if(arr[i] == target){
                list.add(i);
            }
            findAllIndex(arr, target, i+1);
        }
}
