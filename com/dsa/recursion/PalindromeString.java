package com.dsa.recursion;
//Problem : is the given String is palindrome
//Intiution : Reverse string by adding last index to empty string and reduce index with each recursive call
//time complexity : O(n^2) because string concatenate creates new string object with each call.
//space caomplexity : O(n) 

public class PalindromeString {
    public static void main(String[] args) {
        String str = "nattan";
        String rev = reverse(str, str.length() - 1) ;

        //check palindrome
        if(str.equals(rev)){//.equals() method is used to compare values,
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static String reverse(String str , int index){
        //basecase
        if(index < 0){
            return "";
        }
        return str.charAt(index) + reverse(str, index-1);
    }
}
