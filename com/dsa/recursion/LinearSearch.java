package com.dsa.recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        System.out.println(findFromFirst(arr, 18, 0));
        System.out.println(findFromLast(arr, 18, arr.length-1));
        System.out.println(find(arr, 18, 0));
        //findAllIndex(arr,18, 0);
        // System.out.println(list);
        System.out.println(findAllIndex(arr, 18, 0, new ArrayList<>()));
        System.out.println(findAll(arr, 18, 0));
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
          static ArrayList<Integer> findAllIndex(int[] arr, int target,int i,ArrayList<Integer> list){
            if(arr.length == i){
                return list;
            }
            if(arr[i] == target){
                list.add(i);
            }
            return findAllIndex(arr, target, i+1,list);
        }
        // vvi method
        static ArrayList<Integer> findAll(int[] arr , int target, int index){
            ArrayList<Integer> list = new ArrayList<>();

            if(index == arr.length){
                return list;
            }
            //this contain hold answer for that function call only
            if(arr[index] == target){
                list.add(index);
            }
            ArrayList<Integer> ansFromBelowCall = findAll(arr, target, index+1);

            list.addAll(ansFromBelowCall);

            return list;
        }
}
