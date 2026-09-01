package com.dsa.recursion;
import java.util.List;
import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        // List<List<Integer>> ans = subSet(arr);
        // for(List<Integer> list : ans){
        //     System.out.println(list);
        // }
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subSets(nums);
        System.out.println(ans);
    }
    //iteration
    static List<List<Integer>> subSet(int[] arr){
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    for(int num : arr){
        int n = outer.size();
        for(int i = 0; i < n; i++){
            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }
    return outer;
    }
    //recursion
    static List<List<Integer>> subSets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result,nums,new ArrayList<>(),0);
        return result;       
    }
    static void backTrack(List<List<Integer>> outer,int[] nums,List<Integer> inner,int start){
        //including empty list at starting
        outer.add(new ArrayList<>(inner));

        for(int i = start; i < nums.length; i++){
            //take
            inner.add(nums[i]);

            //backtrack
            backTrack(outer, nums, inner, i + 1);

            //remove
            inner.remove(inner.size() - 1);
        }
    }
}

