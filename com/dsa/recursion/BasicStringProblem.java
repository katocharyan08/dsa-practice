package com.dsa.recursion;

public class BasicStringProblem {
    public static void main(String[] args) {
        System.out.println(skip("baccad"));    
    }
    // 1st way
    static void removeChar(String str, String ans){
        if ( str.isEmpty()){
           System.out.println(ans);
           return;
        }
        char ch = str.charAt(0);
        if (ch == 'a'){
            removeChar(str.substring(1), ans);
        }
        else{
            removeChar(str.substring(1), ans + ch);
        }
    }
    // 2nd way
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip(str.substring(1));
        }
        else{
            return ch + skip(str.substring(1));
        }
    }
}
