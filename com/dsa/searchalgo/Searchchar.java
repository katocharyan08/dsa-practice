package com.dsa.searchalgo;

public class Searchchar {
    public static void main(String[] args) {
        String name = "Aryan katoch";
        char target = 'o';
        System.out.println(toSearch(name , target ));//passing arguments 

        //.toCharArray is use for convert String into a Character array
       // System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean toSearch(String str , char target){
         //base case1
        if (str.length() == 0 ){
             return false;
          }
          //basecase2
        //   if(target == str.charAt('')){
        //     return false;
        //   }
          //logic
          for(int i = 0 ; i < str.length();i++){
             //str.charAt(i) represents char at that paeticular index
            if(str.charAt(i) == target){
                    return true;
               }
          }
          //if char not present 
          return false;
    }
}
