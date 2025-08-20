//using for each loop
package com.dsa.searchalgo;
public class Searchchar1 {
    public static void main(String[] args) {
        String name = "mithu";
        char target = 'p';
        System.out.println(toSearch(name,target));
    }

    //function 
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
          for(char ch : str.toCharArray()){
            if (target == ch){
                return true;
            }
          }
          
          //if char not present 
          return false;
    }

}
