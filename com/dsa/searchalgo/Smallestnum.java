package com.dsa.searchalgo;
public class Smallestnum {
    public static void main(String[] args) {
        char[] arr = {'a','c','f','j'};
        char target = 'c';
        char ans = smallestnum(arr, target); 
        System.out.println(ans);

    }
    static char smallestnum(char [] letters , char target){
        int start = 0;
        int end = letters.length - 1;
        int N = letters.length;
        while(start <= end){
            //find mid element
            int mid = start + (end - start)/2;
        // if(target == letters[mid]){
        //     return letters[mid + 1];
        // }
            if(target < letters[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }

        }
        return letters[start % N];//important statement -. works only while loop break
    }
}
