package com.dsa.arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] LA = {1,2,3,5,6,7};
// let say insert 4
         int ITEM = 4;

         int k = 3;//at kth position we are gonna insert the element
         int n = LA.length;//6 
         int j = n;//initialise counter
         while(j >= k){//use for shifting elements and creating space
            LA[j+1] = LA[j];
            j--;
         }
         //now insert element
        System.out.println( LA[k] = ITEM);
         n = n+1;//7 bcoz we have insert a element
       
    }
}
