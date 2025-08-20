package com.dsa.searchalgo;
public class Mainsearch{
    public static void main(String [] args){
       // int[] num = {};
        int[] num = {2,44,22,75,56,8,5,4,46,54,643345,465,69,51,15,656588,33,21};
        int target = 2;
     //int result = linearsearch(num, target);
     //System.out.println("index = " + result);
     int result = linearsearch2(num, target);
     System.out.println("element = " + result);

    }
    //return index
    static int linearsearch(int [] arr , int target){
        //basecase
        if (arr.length == 0){
            return -1; 
        }

        //for loop use for returning index
        //one by one searching
        for (int index = 0;index < arr.length; index++){
            //temporary ref variable  
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //if nothing found then this execute
        return -1;
    }
    //return element
    static int linearsearch2(int [] arr , int target){
        //basecase
        if (arr.length == 0){
            return Integer.MIN_VALUE; 
        }

        //you can use for each  use for returning element not index
        //one by one searching
       for (int element:arr){
        if (element == target){
            return element;
           }
        }
        
        //if nothing found then this execute
        //cannot return -1 bcoz now we returning element and -1 can be any element 
        //So in default we return
        return Integer.MIN_VALUE;
    }
}