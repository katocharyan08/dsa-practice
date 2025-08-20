package com.dsa.array;
//for minimum element in array

public class p_2 {
  public static void main (String[] args){
    int[] array= {556,-786,-889,23,-34};
     int min = Integer.MAX_VALUE;// mtlb isse uper koi maximum nhi hai ,is ke niche saab min. hai..
     for(int element : array){
        if(element<min){
            min=element;
        }
     }
     System.out.println("the minimum element in an array is : "+min);
 } 
}
